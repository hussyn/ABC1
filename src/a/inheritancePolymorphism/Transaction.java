package a.inheritancePolymorphism;

//Abstract class Transaction represents an ATM transaction
  public abstract class Transaction
  {
     // attributes
     private int accountNumber; // indicates account involved
     private Screen screen; // ATM's screen
     private BankDatabase bankDatabase; // account info database

     // no-argument constructor invoked by subclasses using super()
     public Transaction()
     {
     } // end no-argument Transaction constructor

     // return account number
     public int getAccountNumber()
     {
     } // end method getAccountNumber

     // return reference to screen
     public Screen getScreen()
     {
     } // end method getScreen

     // return reference to bank database
     public BankDatabase getBankDatabase()
     {
     } // end method getBankDatabase

     // abstract method overridden by subclasses
     public abstract void execute();
  } // end class Transaction