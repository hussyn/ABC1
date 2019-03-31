package a.inheritance;

import java.util.Scanner;

class BankInternal {
    int acno;
    float bal=0;
    Scanner get = new Scanner(System.in);
    BankInternal()
    {
        System.out.println("Enter Account Number:");
        acno = get.nextInt();
        System.out.println("Enter Initial Balance:");
        bal = get.nextFloat();        
    }
    void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance: "+bal);
        }
        else
        {
            System.out.println("Insufficient funds!!");
        }
    }
}