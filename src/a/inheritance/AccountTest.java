package a.inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AccountTest {
	
	    private static double amount;
	    private static ArrayList<Account> accountList = new ArrayList<>();
	    private static Account selectedAccount;
	    private static boolean flag = false;

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        // Menu starts from here
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the option for the operation you need:");
	        System.out
	                    .println("****************************************************");
	        System.out
	                .println("[ Options: new - New Account del - Delete Account ]");
	        System.out
	                .println("[       dp - Deposit    wi - Withdraw  bal - Check balance    ]");
	        System.out
	                .println("[           se - Select Account exit - Quit      ]");
	        System.out
	                .println("****************************************************");
	        Account account = null;
	        while (true) {
	            System.out.println("> "); // indicator for user input
	            String choice = input.next();
	            // Options
	            switch (choice) {
	                case "new":
	                    // Create new account
	                    int accNo = 0;
	                    int bal = 0;
	                    System.out.println("Enter account number : ");
	                    accNo = input.nextInt();
	                    System.out.println("Enter initial balance: ");
	                    bal = input.nextInt();
	                    System.out.println("Current account: " + accNo + " "
	                        + "Balance " + bal);
	                    account = new Account(bal, accNo);
	                    accountList.add(account);
	                    break;
	                case "se":
	                    // select account
	                    System.out
	                        .println("Enter account number for further operations : ");
	                    int selectedAcc = scan.nextInt();
	                    System.out.println("Selected account : " + selectedAcc);
	                    for (Object object : accountList) {
	                        selectedAccount = (Account) object;
	                        if (selectedAccount.getAccNumber() == selectedAcc) {
	                            flag = true;
	                            break;
	                        } else {
	                            flag = false;
	                        }
	                    }
	                    if (!flag) {
	                        System.out.println("Account doesn't exists.");
	                    }
	                    if (accountList.size() == 0) {
	                        System.out.println("Zero account exists.");
	                    }
	                    break;
	                case "del":
	                    // close account
	                    System.out
	                        .println("Enter account number for further operations : ");
	                    int selectedAcc1 = scan.nextInt();
	                    System.out.println("Selected account : " + selectedAcc1);
	                    Iterator<Account> iterator = accountList.iterator();
	                    while (iterator.hasNext()) {
	                        selectedAccount = (Account) iterator.next();
	                        if (selectedAccount.getAccNumber() == selectedAcc1) {
	                            iterator.remove();
	                            flag = true;
	                            break;
	                        }
	                    }
	                    if (!flag) {
	                        System.out.println("Account doesn't exists.");
	                    }
	                    System.out.println("Account " + selectedAcc1 + " closed.");
	                    break;
	                case "dp":
	                    // Deposit amount
	                    System.out.println("Enter amount to deposit :  ");
	                    amount = scan.nextDouble();
	                    if (amount <= 0) {
	                        System.out
	                            .println("You must deposit an amount greater than 0.");
	                    } else {
	                        if (flag) {
	                            selectedAccount.deposit(amount);
	                            System.out.println("You have deposited " + amount
	                                + ". Total balance : "
	                                + (selectedAccount.getBalance()));
	                        } else {
	                            System.out.println("Please select account number.");
	                        }
	                    }
	                    break;
	                case "wi":
	                    // Withdraw amount
	                    System.out.println("Enter amount to be withdrawn: ");
	                    amount = scan.nextDouble();
	                    if (amount > account.getBalance() && amount <= 0) {
	                        System.out.println("You can't withdraw that amount!");
	                    } else if (amount <= selectedAccount.getBalance()) {
	                        if (flag) {
	                            selectedAccount.withdraw(amount);
	                            System.out.println("You have withdraw : " + amount
	                                + " NewBalance : "
	                                + selectedAccount.getBalance());
	                        } else {
	                            System.out.println("Please select account number.");
	                        }
	                    }
	                    break;
	                case "bal":
	                    // check balance in selected account
	                    if (flag) {
	                        System.out.println("Your current account balance : "
	                            + selectedAccount.getBalance());
	                    } else {
	                        System.out.println("Please select account number.");
	                    }
	                    break;
	                case "exit":
	                default:
	                    // quit
	                    System.out.println("Thank You. Visit Again!");
	                    flag = false;
	                    input.close();
	                    scan.close();
	                    System.exit(0);
	                    break;
	            }
	        } // end of menu loop
	    }// end of main
	} // end of class



/*Output :

Enter the option for the operation you need:
****************************************************
[ Options: new - New Account del - Delete Account ]
[       dp - Deposit    wi - Withdraw  bal - Check balance    ]
[           se - Select Account exit - Quit      ]
****************************************************
> new
Enter account number : 101
Enter initial balance: 10000
Current account: 101 Balance 10000
> new
Enter account number : 102
Enter initial balance: 25000
Current account: 102 Balance 25000
> se
Enter account number for further operations : 103
Selected account : 103
Account doesn't exists.
> se
Enter account number for further operations : 101
Selected account : 101
> bal
Your current account balance : 10000.0
> dp
Enter amount to deposit :  2500
You have deposited 2500.0. Total balance : 12500.0
> wi
Enter amount to be withdrawn: 500
You have withdraw : 500.0 NewBalance : 12000.0
> se
Enter account number for further operations : 102
Selected account : 102
> bal
Your current account balance : 25000.0
> del
Enter account number for further operations : 101
Selected account : 101
Account 101 closed.
> se
Enter account number for further operations : 101
Selected account : 101
Account doesn't exists.
> exit
Thank You. Visit Again!*/

