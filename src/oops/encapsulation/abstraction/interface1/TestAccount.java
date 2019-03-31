package oops.encapsulation.abstraction.interface1;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.setName("sajjad hussain");
		acc.setAccountNo(12345);
		acc.setmailid("s.hussyn@gmail.com");
		acc.setaAmount(4000.00f);
		
		System.out.println("Name:"+acc.getName()+" AccountNo:"+acc.getAccountNo()+"mailid:"+acc.getMailid()+"Amount:"+acc.getAmmount());
	}

}
