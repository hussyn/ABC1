package a.inheritancePolymorphism;

import java.util.Date;
//Bank account inheritance and test program
//Hello, I am a student struggling to make his way through intermediate java programming. This is my first post on a forum. My project is to make a program of a bank account with two subclasses: checking and savings. The checking account has a overdraw limit, but the savings account cannot be used until a certain date has been reached. In addition, I need to write a test program that "Finally write a test program that creates objects of CheckingAccount and SavingsAccount. Ask the user to deposit and withdraw arbitrary amount from the accounts. Be sure to check that the input is a valid input before using it. Finally, invoke the toString() method of each object to test the final balance of the objects. Please also make sure that you ask the user whether he/she would like to continue."

//I think I am doing alright (I hope). I am stuck on the test program though... can someone throw me a bone? This is what I have so far
public class Account {

//define var1, var

    private int id = 0;

    private double balance= 0;

    private static double annualInterestRate = 0;

    private Date dateCreated = new Date();

//no arg constructer

    Account() {

         

        id = 0;

        balance = 0.0;

        annualInterestRate = 0.0;  

    }

//constructor with specific id and initial balance

public Account(int newId, double newBalance) {

        id = newId;

        balance = newBalance;

    }

     Account(int newId, double newBalance, double newAnnualInterestRate) {

        id = newId;

        balance = newBalance;

        annualInterestRate = newAnnualInterestRate;

    }

//accessor/mutator methods for id, balance, and annualInterestRate

    public int getId() {

        return id;

    }

    public double getBalance() {

        return balance;

    }

    public double getAnnualInterestRate() {

        return annualInterestRate;

    }

    public void setId(int newId) {

        id = newId;

    }

    public void setBalance(double newBalance) {

        balance = newBalance;

    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {

        annualInterestRate = newAnnualInterestRate;

    }

//accessor method for dateCreated

 

public Date getDateCreated() {

 

    return dateCreated;

    }

//define method getMonthlyInterestRate

    double getMonthlyInterestRate() {

        return annualInterestRate/1/100 * balance;

    }

//define method withdraw

    double withdraw(double amount) {

        return balance -= amount;

    }  

//define method deposit

    double deposit(double amount) {

        return balance += amount;

    }

}
