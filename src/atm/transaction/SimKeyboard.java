package atm.transaction;

//package simulation;

import java.awt.*;
import java.awt.event.*;

/** Simulate the keyboard portion of the customer console
 */
class SimKeyboard extends Panel
{
    /** Constructor
     *
     *  @param display the display on which to echo typed input
     *  @param envelopeAcceptor - to be notified if cancel is pressed
     */
    SimKeyboard(SimDisplay display,
                SimEnvelopeAcceptor envelopeAcceptor)
    {
        this.display = display;
        this.envelopeAcceptor = envelopeAcceptor;
        
        setLayout(new GridLayout(5,3));
        
        // Create the keys representing digits
        
        Button [] digitKey = new Button[10];
        for (int i = 1; i < 10; i ++)
        { 
            digitKey[i] = new Button("" + i);
            add(digitKey[i]);
        }
        
        add(new Label(""));
        
        digitKey[0] = new Button("0");
        add(digitKey[0]);
        
        add(new Label(""));
        
        // Create the function keys
        
        Button enterKey = new Button("ENTER");
        enterKey.setForeground(Color.black);
        enterKey.setBackground(new Color(128, 128, 255)); // Light blue
        add(enterKey);
        
        Button clearKey = new Button("CLEAR");
        clearKey.setForeground(Color.black);
        clearKey.setBackground(new Color(255, 128, 128)); // Light red
        add(clearKey);
        
        Button cancelKey = new Button("CANCEL");
        cancelKey.setBackground(Color.red);
        cancelKey.setForeground(Color.black);
        add(cancelKey);
        
        // Add action listeners to each key
        
        for (int i = 0; i < 10; i ++)
            digitKey[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    digitKeyPressed(Integer.parseInt(e.getActionCommand()));
                }
            });
            
        enterKey.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                enterKeyPressed();
            }
        });

        clearKey.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                clearKeyPressed();
            }
        });

        cancelKey.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                cancelKeyPressed();
            }
        });
        
        // Allow the user to use the regular keyboard instead of the awt keyboard

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e)
            {
                char keyChar = e.getKeyChar();
                int keyCode = e.getKeyCode();
                if (keyChar >= '0' && keyChar <= '9')
                {
                    digitKeyPressed(keyChar - '0');
                    e.consume();
                }
                else
                {
                    switch (keyCode)
                    {
                        case KeyEvent.VK_ENTER:
                        
                            enterKeyPressed();
                            break;
                            
                        case KeyEvent.VK_CLEAR:
                        
                            clearKeyPressed();
                            break;
                            
                        case KeyEvent.VK_CANCEL:
                        case KeyEvent.VK_ESCAPE:
                        
                            cancelKeyPressed();
                            break;
                    }
                    e.consume();
                }
            }
        });

        // Initialze mode and input buffer
        
        currentInput = new StringBuffer();
        mode = IDLE_MODE;
    }
    
    /** Read input from the keyboard
     *
     *  @param mode the input mode to use - one of the constants defined below.
     *  @param maxValue the maximum acceptable value (used in MENU_MODE only)
     *  @return the line that was entered - null if user pressed CANCEL.
     */
    synchronized String readInput(int mode, int maxValue)
    {
        this.mode = mode;
        this.maxValue = maxValue;
        currentInput.setLength(0);
        cancelled = false;
        if (mode == AMOUNT_MODE)
            setEcho("0.00");
        else
            setEcho("");
        requestFocus();
        
        try
        {
            wait();
        }
        catch(InterruptedException e)
        { }
        
        this.mode = IDLE_MODE;
        
        if (cancelled)
            return null;
        else
            return currentInput.toString();
    }
    
    /** Handle a digit key
     *
     *  @param digit the value on the key
     */
    private synchronized void digitKeyPressed(int digit)
    {
        switch (mode)
        {
            case IDLE_MODE:
            
                break;
                
            case PIN_MODE:
            {
                currentInput.append(digit);
                StringBuffer echoString = new StringBuffer();
                for (int i = 0; i < currentInput.length(); i ++)
                    echoString.append('*');
                setEcho(echoString.toString());
                break;
            }
                
            case AMOUNT_MODE:
            {           
                currentInput.append(digit);
                String input = currentInput.toString();
                if (input.length() == 1)
                    setEcho("0.0" + input);
                else if (input.length() == 2)
                    setEcho("0." + input);
                else
                    setEcho(input.substring(0, input.length() - 2) + "." +
                        input.substring(input.length() - 2));
                break;
            }
            
            case MENU_MODE:
            {
                if (digit > 0 && digit <= maxValue)
                {
                    currentInput.append(digit);
                    notify();
                }
                else
                    getToolkit().beep();
                break;
            }               
        }
    }
    
    /** Handle the ENTER key
     */
    private synchronized void enterKeyPressed()
    {
        switch(mode)
        {
            case IDLE_MODE:
            
                break;
                
            case PIN_MODE:
            case AMOUNT_MODE:
            
                if (currentInput.length() > 0)
                    notify();
                else
                    getToolkit().beep();
                break;
                    
            case MENU_MODE:
            
                getToolkit().beep();
                break;
        }
    }           
                
    /** Handle the CLEAR key
     */
    private synchronized void clearKeyPressed()
    {
        switch(mode)
        {
            case IDLE_MODE:
            
                break;
                
            case PIN_MODE:
            
                currentInput.setLength(0);
                setEcho("");
                break;
                
            case AMOUNT_MODE:
            
                currentInput.setLength(0);
                setEcho("0.00");
                break;
                
            case MENU_MODE:
            
                getToolkit().beep();
                break;
        }
    }           
                
    /** Handle the CANCEL KEY
     */
    private synchronized void cancelKeyPressed()
    {
        switch(mode)
        {
            case IDLE_MODE:
            
                // It is possible to press the cancel key when requested
                // to insert an envelope - so notify the envelope acceptor
                // of this fact (notification is ignored if acceptor is
                // not waiting for an envelope)
                
                synchronized(envelopeAcceptor)
                {
                    envelopeAcceptor.notify();
                }
                
            case PIN_MODE:
            case AMOUNT_MODE:
            case MENU_MODE:
            
                cancelled = true;
                notify();
        }
    }           
    
    /** Set the echo string displayed on the display
     *
     *  @param echo the text to set the echo to (the whole line)
     */
    private void setEcho(String echo)
    {
        display.setEcho(echo);
    }
    
    /** The display onto which to echo input
     */
    private SimDisplay display;
    
    /** The envelope acceptor to notify if CANCEL is pressed while not awaiting
     *  customer input
     */
    private SimEnvelopeAcceptor envelopeAcceptor;
    
    /** Current input mode - one of the values defined below
     */
    private int mode;
    
    /** Not currently reading input - ignore keys (except CANCEL)
     */
    private static final int IDLE_MODE = 0;
    
    /** Read input in PIN mode - allow user to enter several characters,
     *  and to clear the line if the user wishes; echo as asterisks
     */
    private static final int PIN_MODE = Simulation.PIN_MODE;
    
    /** Read input in amount mode - allow user to enter several characters,
     *  and to clear the line if the user wishes; echo what use types
     */
    private static final int AMOUNT_MODE = Simulation.AMOUNT_MODE;
    
    /** Read input in menu choice mode - wait for one digit key to be pressed,
     *  and return value immediately.
     */
    private static final int MENU_MODE = Simulation.MENU_MODE;
    
    /** Current partial line of input
     */
    private StringBuffer currentInput;
    
    /** Cancellation flag - set to true if user cancels
     */
    private boolean cancelled;
    
    /** Maximum valid value - used in MENU_MODE only
     */
    private int maxValue;
}                               
    
    