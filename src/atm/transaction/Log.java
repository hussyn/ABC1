package atm.transaction;

//package atm.physical;
import atm.transaction.Message;
import atm.transaction.Money;
import atm.transaction.Status;
import atm.transaction.Simulation;

/** Manager for the ATM's internal log.  In a real ATM, this would 
 *  manage a physical device; in this simulation,  it uses classes 
 *  in package simulation to simulate the device.
 */
 
public class Log
{
    /** Constructor
     */
    public Log()
    {
    }
    
    /** Log the sending of a message to the bank
     *
     *  @param message the message to be logged
     */
    public void logSend(Message message)
    {
        Simulation.getInstance().printLogLine("Message:   " + message.toString()); 
    }
    
    /** Log a response received from a message
     *
     *  @param status the status object returned by the bank in response
     */
    public void logResponse(Status response)
    {
        Simulation.getInstance().printLogLine("Response:  " + response.toString());
    }
    
    /** Log the dispensing of cash by the cash dispenser
     *
     *  @param amount the amount of cash being dispensed
     */
    public void logCashDispensed(Money amount)
    {
        Simulation.getInstance().printLogLine("Dispensed: " + amount.toString());
    }
    
    /** Log accepting an envelope.  This method is only called if an envelope
     *  is actually received from the customer
     */
    public void logEnvelopeAccepted()
    {
        Simulation.getInstance().printLogLine("Envelope:  received");
    }
}