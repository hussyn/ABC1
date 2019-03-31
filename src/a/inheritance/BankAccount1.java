package a.inheritance;

public class BankAccount1
{
   private double balance;

   public BankAccount1()
   {
      balance = 0;
   }

   public BankAccount1(double initialBalance)
   {
      balance = initialBalance;
   }

   public void deposit(double amount)
   {
      double newBalance = balance + amount;
      balance = newBalance;
   }

   public void withdraw(double amount)
   {
      double newBalance = balance - amount;
      balance = newBalance;
   }

   public double getBalance()
   {
      return balance;
   }
}
