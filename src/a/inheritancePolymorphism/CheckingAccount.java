package a.inheritancePolymorphism;

public class CheckingAccount extends Account {
	private double overdrafLimit;
	
	public CheckingAccount(int newId, double newBalance) {
		super(newId, newBalance);
		setOverdraftLimit(overdrafLimit);
		
	}
	public void setOverdraftLimit(double o) {
		overdraftLimit = o;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public double withdraw(double amount) {
		if(getBalance() + overdraftLimit < amount)
			System.out.print("Cannot be done");
		else
			return super.withdraw(amount);
	}
public String toString()
	{
		return super.toString(); //+ \n Overdraft limit:
	" + overdraftLimit;
	}
	}
