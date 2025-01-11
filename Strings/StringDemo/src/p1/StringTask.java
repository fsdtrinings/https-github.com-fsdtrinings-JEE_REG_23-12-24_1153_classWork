package p1;

public class StringTask {

	String emails[] = {
			"ramesh@gmail.com",
			"pooja@outlook.com",
			"amitkuamr@gmail.com",
			"anoop@outlook.com",
			"neha@yahoo.com",
			"ashish@linkedin.com",
			"varsha@gmail.com",
	};
	
	public String[] approvedEmails()
	{
		// cannot use collection
		/*
		 * write code to approve all the emails which are based on 
		 *    gamil.com or linkedin.com
		 * */
		// you can use string function
			// two approach 
		    // 1st :  check if email endsWith("gamil.com") || emails.endWirth(linkedIn.com);
		    // 2nd :  use Split  , break the String based on @ , find out 2nd index value and compare with gmail or linked In 
				
        // take current email and insert into new String 
		
		return null;
	}
	
	public void printApprovedEmails(String arr[])
	{
		// code to print the emails which approved
	}
	
	public static void main(String[] args) {
		StringTask obj = new StringTask();
		obj.approvedEmails();
		obj.printApprovedEmails(null);
	}
}
