package a.Exception;

import java.util.Scanner;

public class ATMTest {
public static void main (String args[])
    {
ATM myATM = new ATM();
}
    int choice;
    int debit;
    int credit;
    int balance;
    double amount;
    double methodOutput;

    Scanner input = new Scanner(System.in)

    do
	    {
	    System.out.println("1. Withdrawal");
	    System.out.println("2. Deposit");
	    System.out.println("3. Get Balance");
	    System.out.println("4. Exit");
	
	    choice = input.nextInt();
	
	    if (choice == 1)
	    {
	    System.out.println("Enter the amount you want to withdraw, please: ");
	
	    choice = input.nextInt();
	    methodOutput = withdrawal (amount);
	    }
	    
	    if (choice == 2)
	    {
	    System.out.println("Enter the amount you will deposit: ");
	    choice = input.nextInt();
	    methodOutput = deposit(amount);
	    }
	
	    if (choice == 3)
	    {
	    System.out.println("The available amount of cash to take from me is: ");
	    }
	
	    if (choice == 4)
	    {
	    System.out.println("See ya later " + firstName + lastName);
	    }
	    }
    while (choice != 4);


    
}
