package p2;

import java.util.Scanner;

import p1.Account;
import p1.ContactDetails;
import p1.KYCVerification;

public class MainApp {
	
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		MainApp app = new MainApp();
		
		
		Account a = new Account(101, "Amit Kumar", 5000);
		
		app.doDeposite(a);
		app.doWithdrawal(a);

		// ---- perform linking operations ---
		app.doKYCVerification(a);
		app.doUpdateAccountContactInfo(a);
		
		//------- click on print details action ----
		app.printDetails(a);
		
		
	}
	
	
	public void doKYCVerification(Account a)
	{
		KYCVerification kyc = new KYCVerification("ABC123N",123456987, "Passport","145236789");
		a.setKyc(kyc);// linked KYC doc's with an account a
		
	}
	
	public void doUpdateAccountContactInfo(Account a)
	{
		ContactDetails cd = new ContactDetails("ABC-123","amit@gmail.com",147852963);
		a.setContact(cd);
	}
	
	
	public void printDetails(Account a)
	{
		System.out.println("Account Holder Name "+a.getUsername());
		System.out.println("Show KYC Docs");
		System.out.println("\n PAN Number : "+a.getKyc().getPanNumber());
		System.out.println("\n Adhar Number : "+a.getKyc().getAdharNumber());
		System.out.println("\n 3rd Doc : "+a.getKyc().getDocumentType()+" - "+a.getKyc().getDocumentNumber());
		
		
		
	}
	
	
	
	public void doDeposite(Account a)
	{
		System.out.println("Enter the amount : - ");
		int amount = new Scanner(System.in).nextInt();
		
		int latestBalance = a.deposite(amount);
		System.out.println("Notification : latest Updated balance "+latestBalance);
	}
	public void doWithdrawal(Account a)
	{
		System.out.println("Enter the amount : - ");
		int amount = new Scanner(System.in).nextInt();
		
		int latestBalance = a.withdrawal(amount);
		if(latestBalance>0)
				System.out.println("Notification : latest Updated balance "+latestBalance);
		else System.out.println("Contact to Bank Admin");
	}
	
	

}
