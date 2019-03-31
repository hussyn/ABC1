package a.inheritance;
//Explaining Inheritance in java using Bank Accounts Example
import java.io.*;
 class account1
{
int ac;
String nm,ad,ph;
double bl;
account1(int i, String n, String a, String p, double d)
{
ac=i;
nm=n;
ad=a;
ph=p;
bl=d;
}

public void accountholder()
{
System.out.println("Account Number :"+ac);
System.out.println("Account Holder Name :"+nm);
System.out.println("Account Holder Address :"+ad);
System.out.println("Account Holder Phone :"+ph);
System.out.println("Account Holder Balance :"+bl);
}

}

class savingac extends account1
{
double intr;
savingac(int i, String n, String a, String p, double d, double in){
super(i,n,a,p,d);
intr=in;
}

public void diplaybalance(double wamt)
{
double bal=bl-wamt;
System.out.println("Intrest :"+intr);
System.out.println("Account Holder Balance :"+bal);
}
public void calculateintrest()
{
double it=(bl*intr)/100;
System.out.println("Intrest for Year :"+it);
}

}

public class bankconstructor {

public static void main(String[] args)throws IOException {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter Account Number :");
int acno=Integer.parseInt(br.readLine());

System.out.println("Enter Account Holder Name :");
String acnm=br.readLine();

System.out.println("Enter Account Holder Address :");
String acad=br.readLine();

System.out.println("Enter Account Holder Phone :");
String acph=br.readLine();

System.out.println("Enter Account Holder Balance :");
double acbl=Double.parseDouble(br.readLine());

System.out.println("Enter Account Intrest :");
double acin=Double.parseDouble(br.readLine());

System.out.println("Enter Withdrawal amount :");
double acw=Double.parseDouble(br.readLine());

savingac sac=new savingac(acno,acnm, acad,acph,acbl,acin);
sac.accountholder();
sac.diplaybalance(acw);
sac.calculateintrest();
}
}