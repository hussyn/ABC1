package a.ArrayList;



/*I am trying to set up an arraylist class that will create difference bank accounts and allow you to edit the accounts i.e add,remove make deposit.

I am having triuble writing the makeDeposit class can anyone give me some advice.*/
public class BankAccount
{
    private Name accountName;
    private Address accountAddress;
    private int balance;  // as pence
    private static int accountNumberGenerator = 10000001;
    private String accountNumber;
    

    /**
     * Constructor for BankAccount
     * @param number account number
     * @param name account name
     */
    public BankAccount(String firstName, String lastName,
                       String addr1, String addr2, String addr3, String postcode, double openingBalance)
    {
        accountNumber = "" + accountNumberGenerator++;
        accountName = new Name(firstName, lastName);
        accountAddress = new Address (addr1, addr2, addr3, postcode);
        balance = convertToPence(openingBalance);
    } 
    
    // accessors (queries)

    /**
     * @return the account number
     */
    public String getAccountNumber()
    { 
        return accountNumber;
    } 

    /**
     * @return the account name
     */
    public String getAccountName()
    { 
        return accountName.getFullName();
    } 
    
    /**
     * @return the account address
     */
    public String getAccountAddress()
    {
        return accountAddress.getFullAddress();
    }

    /**
     * @return the balance in the account
     */
    public String getBalance()
    { 
        return penceToPounds(balance);
    } 
    
    // mutators 
    
    /**
     * sets new value(s) for account name
     * 
     * @param firstName     first name
     * @param lastName      last name
     */
    public void changeAccountName(String firstName, String lastName)
    {
        accountName.setFirst(firstName);
        accountName.setLast(lastName);
    }
    
    /**
     * set new value(s) for account address
     * 
     * @param addr1     first line of address
     * @param addr2     second line of address
     * @param addr3     third line of address or ""
     * @param postcode  the postcode
     */
    
    public void changeAccountAddress(String addr1, String addr2, String addr3, String postcode)
    {
        accountAddress.setFullAddress(addr1, addr2, addr3, postcode);
    }
    
    /**
     * adds an amount to the balance
     * @param amount the amount to add to balance
     */
    public void deposit(double amount)
    { 
        balance = balance + convertToPence(amount);
    } 

    /**
     * withdraws a given amount from the account
     * @param amount the amount to withdraw
     * @return the new balance
     */
    public void withdraw(double amount)
    { 
        if (balance - convertToPence(amount) <= 0)
        {
            System.out.println("Transaction refused: Insufficient funds.");
        }
        else
        {
            balance = balance - convertToPence(amount);
        }
    } 

    // other methods
    private int convertToPence(double amount)
    {
        return (int)(100*amount);
    }
    
    private String penceToPounds(int pence)
    {
      int pounds;
      int remainingPence;
      String result;    
      pounds = pence / 100;
      remainingPence = pence % 100;    
      result = "£"+pounds+".";    
      if (remainingPence < 10)
      {
        result = result+"0"+remainingPence;
      }
      else
      {
         result = result+remainingPence;
      }       
      return result;
    } 
    
     /**
     * Indicates whether some other object is "equal to" this one.
     * Checks for matches of accountNumber
     * @return true if a match found otherwise false
     */
    public boolean equals(Object o)
    {
        if ( o == this )
            return true;
        BankAccount account = (BankAccount)o;
        if ( (accountNumber.equals(account.getAccountNumber())))
            return true;
        return false;    
    }
    
    /**
     * @return all data values as a formatted string
     */
    public String toString()
    {
        String output = accountName.getFullName() +"\n" + accountAddress.getFullAddress() + "\n"
                        + "Account Number: " + accountNumber + "\tBalance: " + getBalance();
        
        return output;
    }

}  
