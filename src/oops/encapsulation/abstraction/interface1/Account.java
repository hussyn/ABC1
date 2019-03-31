package oops.encapsulation.abstraction.interface1;

public class Account {

	//private data member
	private String name;
	private String mailid;
	private int accountNo;
	private float amount;
	
	//set getter and setter method
	
	public String getName() {
		
		return name;
		}
	
		public String getMailid() {
			return mailid;
		}
		
		public int getAccountNo() {
			return accountNo;
			
		}
		public float getAmmount() {
			return amount;
			
		}
		
		//setter mothod for data member
		
		public void setName(String name) {
			this.name=name;
		}
		
		public void setmailid(String name) {
			this.mailid=mailid;
		}
		public void setAccountNo(int accountNo) {
			this.accountNo=accountNo;
			
		}
		
		public void setaAmount(float amount) {
			this.amount=amount;
		}
	
}
