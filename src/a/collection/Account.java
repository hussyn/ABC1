package a.collection;

public class Account

{

    // variables contained within class account //

    // accessible only via methods/functions as //

    // they are private and subsequently can    //

    // only be changed via member functions.    //

 

    private Client person;            // account holders client

    private double balance;           // current account balance

    private long account_number;      // account number

    // Constuctor for Objects of type account //

    Account( Client c_client, double c_balance, long c_num)

    {

        person = c_client;

        balance = c_balance;

        account_number = c_num;

    }

    // Function to deposit funds into an account //

    public void deposit_funds( double p_amount)

    {

        balance += p_amount;

    }

    // function to withdraw funds from an account //

    // checks to see whether funds are available. //

    public int withdraw_funds( double p_amount)

    {

        // check if enough funds

        if ( p_amount > balance )

            return -1;

        else

            balance -= p_amount;

        return 0;

    }

 

    // returns account balance //

    public double get_balance()

    {

        return balance;

    }

 

    // returns account holders name //

    public String get_name()

    {

        // Access our client object (person)

        // then access getName() function

        // of Client class

        return person.getName();

    }

 

    // returns account number //

    public long get_account_number()

    {

        return account_number;

    }

 

    public Client getClient()

    {

        return person;

    }

}
