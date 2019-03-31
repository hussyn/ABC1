package inheritance;
//For example, a checking account is a kind of account in which you can make deposits and withdrawals. Similarly, a truck is a kind of vehicle used for hauling large items.
class Account
{
   private String name;

   private long amount;

   Account(String name, long amount)
   {
      this.name = name;
      setAmount(amount);
   }

   void deposit(long amount)
   {
      this.amount += amount;
   }

   String getName()
   {
      return name;
   }

   long getAmount()
   {
      return amount;
   }

   void setAmount(long amount)
   {
      this.amount = amount;
   }
}
/*super() and the no-argument constructor
If super() is not specified in a subclass constructor, and if the superclass doesn't declare a no-argument constructor, then the compiler will report an error. This is because the subclass constructor must call a no-argument superclass constructor when super() isn't present.
*/
class SavingsAccount extends Account
{
   SavingsAccount(long amount)
   {
      super("savings", amount);
   }
}

class CheckingAccount extends Account
{
   CheckingAccount(long amount)
   {
      super("checking", amount);
   }

   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}