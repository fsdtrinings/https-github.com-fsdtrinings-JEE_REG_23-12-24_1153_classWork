package p1;

public class Account {

	private int accountid;
	private String username;
	private int balance;
	private int cashback; // it must be a local variable 
	private KYCVerification kyc;
	private ContactDetails contact;
	
	
	public Account() {
	}
	public Account(int accountid, String username, int balance, int cashback) {
		this.accountid = accountid;
		this.username = username;
		this.balance = balance;
		this.cashback = cashback;
	}
	
	
	
	
	public Account(int accountid, String username, int balance) {
		super();
		this.accountid = accountid;
		this.username = username;
		this.balance = balance;
	}
	
	
	
	
	public KYCVerification getKyc() {
		return kyc;
	}
	public void setKyc(KYCVerification kyc) {
		this.kyc = kyc;
	}
	public ContactDetails getContact() {
		return contact;
	}
	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCashback() {
		return cashback;
	}
	public void setCashback(int cashback) {
		this.cashback = cashback;
	}
	
	
	public int deposite(int amount)
	{
		this.balance+=amount;
		return this.balance;
	}
	
	public int withdrawal(int amount)
	{
		if(this.balance-amount>5000)
		{
			// allow
		
			this.balance-=amount;
			this.cashback = (int)(amount*0.01);
			this.balance+=this.cashback;
			return this.balance;
		}
		else
		{
			System.out.println("Exception Msg : Min Limit Exception");
			// error msg
			// exception 
			return -1; // an indication for error 
		}
		
	}
	
	
	
	
}//end class






















