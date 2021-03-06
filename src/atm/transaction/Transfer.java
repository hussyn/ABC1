package atm.transaction;
import atm.transaction.ATM;
import atm.transaction.Session;
//import atm.transaction.physical.*;
import atm.transaction.AccountInformation;
import atm.transaction.Card;
import atm.transaction.Message;
import atm.transaction.Money;
import atm.transaction.Status;
import atm.transaction.Receipt;
/** Representation for a transfer transaction
 */
public class Transfer extends Transaction
{
    /** Constructor
     *
     *  @param atm the ATM used to communicate with customer
     *  @param session the session in which the transaction is being performed
     *  @param card the customer's card
     *  @param pin the PIN entered by the customer
     */
    public Transfer(ATM atm, Session session, Card card, int pin)
    {
        super(atm, session, card, pin);
    }
    
    /** Get specifics for the transaction from the customer
     *
     *  @return message to bank for initiating this transaction
     *  @exception CustomerConsole.Cancelled if customer cancelled this transaction
     */
    protected Message getSpecificsFromCustomer() throws CustomerConsole.Cancelled
    {
        from = atm.getCustomerConsole().readMenuChoice(
            "Account to transfer from",
            AccountInformation.ACCOUNT_NAMES);

        to = atm.getCustomerConsole().readMenuChoice(
            "Account to transfer to",
            AccountInformation.ACCOUNT_NAMES);

        amount = atm.getCustomerConsole().readAmount("Amount to transfer");
        
        return new Message(Message.TRANSFER, 
                        card, pin, serialNumber, from, to, amount);
    }
    
    /** Complete an approved transaction
     *
     *  @return receipt to be printed for this transaction
     */
    protected Receipt completeTransaction()
    {
        return new Receipt(this.atm, this.card, this, this.balances) {
            {
                detailsPortion = new String[2];
                detailsPortion[0] = "TRANSFER FROM: " + 
                                    AccountInformation.ACCOUNT_ABBREVIATIONS[from] +
                                    " TO: " + 
                                    AccountInformation.ACCOUNT_ABBREVIATIONS[to] ;
                detailsPortion[1] = "AMOUNT: " + amount.toString();
            }
        };
    }
    
    /** Accounts to transfer from
     */
    private int from;
    
    /** Account to transfer to
     */
    private int to;
    
    /** Amount of money to transfer
     */
    private Money amount;           
}