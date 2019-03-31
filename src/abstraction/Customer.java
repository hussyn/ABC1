package abstraction;
/*Note: Data abstraction can be used to provide security for the data from the unauthorized methods.

Note: In Java language data abstraction can achieve using class.
All are performing operations on the ATM machine like cash withdrawal, money transfer, retrieve mini-statement…etc. but we can't know internal details about ATM.
*/
public class Customer
{
int account_no;
float balance_Amt;
String name;
int age;
String address;
void balance_inquiry()
{
/* to perform balance inquiry only account number
is required that means remaining properties 
are hidden for balance inquiry method */
}
void fund_Transfer()
{
/* To transfer the fund account number and 
balance is required and remaining properties 
are hidden for fund transfer method */
}}