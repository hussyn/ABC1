package a.inheritancePolymorphism;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class SavingsAccount extends Account {
	public SavingsAccount(int newId, double newBalance) {
		super(newId,	newBalance);
	}

//Establishes current date and Preset date
	public class PresetDate {
	public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public Date currentDate = new Date();
	public Date PreSet = new Date("2012/10/01");
		}

	//a savings account cannot be overdrawn
	public double withdraw (double amount, Date currentDate, Date PreSet)
	{
		if (getBalance() < amount)
			 {
			 System.out.println("Amount is larger than current balance.");
			 }
		if (currentDate.after(PreSet)) {
			 	System.out.println("Amount exceeds balance or account has not reached preset date.");
			 	}
		
		return super.withdraw(amount); }
		
	
		}
