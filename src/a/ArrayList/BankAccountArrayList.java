package a.ArrayList;

import java.util.*;

public class BankAccountArrayList
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
        
        
         accounts.remove(index);

    }

    public int getNumberOfBankAccounts()

    {
        return accounts.size();

    }
    
    
    public void printAccount(String accountNumber)
    
    {
      
    }
    
    public void makeDeposit(String accountNumber,double amount)
    
    {   
        int index = 0;
        index = findAccount (accountNumber);
       
        balance = amount + balance;
       
        
        
    }
    
    public void makeWithdrawal(String accountNumber, double amount)
    
    {
        
        
        
        
    }
    
    public String toString()
    
    {
        
    }
    
    private int findAccount(String accountNumber)
    
        {
    
        int index = 0;
        for ( BankAccount ba : accounts)
       {
        if ( ba.getAccountNumber() == accountNumber)         
            return index;
     //   return accounts.indexOf(accountNumber);
    }
}
    
}

