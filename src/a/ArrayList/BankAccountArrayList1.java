package a.ArrayList;

public class BankAccountArrayList1
{
    private ArrayList < BankAccount > accounts;

    /**
     * Constructor for objects of class BankAccountArrayList
     */
    public BankAccountArrayList()
    {
        accounts = new ArrayList < BankAccount >();
    }

    public void openBankAccount(String firstName, String lastName,
    String addr1, String addr2, String addr3, String postcode, double openingBalance)

    {

        accounts.add(new BankAccount(firstName, lastName, addr1, addr2, addr3, postcode, openingBalance));
    }

    public void removeAccount(String accountNumber)

    {
        int index = 0;
        index = findAccount( accountNumber);
        
        accounts.remove(accountNumber);

    }

    public int getNumberOfBankAccounts()

    {
        return accounts.size();

    }
    
    
    public void printAccount(String accountNumber)
    
    {
         int index = 0;
         index = findAccount(accountNumber);
         
        
    }
    
    public String toString()
    
    {   String output = "";
        for ( BankAccount acc : accounts ) 
            output = output + acc +"\n";
        return output;
        
        
    }
    
    public void makeDeposit(String accountNumber,double amount)
    
    {
         int index = 0;
         index = findAccount(accountNumber);
         
        
        
    }
    
    public void makeWithdrawal(String accountNumber, double amount)
    
    {
         int index = 0;
         index = findAccount(accountNumber);
        
        
        
        
    }
    
   
    public int findAccount(String accountNumber)
    
        
  {  
   
        int index = 0;
        for ( BankAccount bankAccount : accounts)
       {
        if( bankAccount.getAccountNumber().equals(accountNumber))         
            return index;
            
            index++;
            
        
          }
        
        return index -1;

    
    
}
}

