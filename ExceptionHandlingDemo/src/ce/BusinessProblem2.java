package ce;

import java.util.Scanner;

public class BusinessProblem2 {

	public String takeInput(String fieldName)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value for "+fieldName);
		return sc.nextLine();
	}
	
	
	public void fillJobForm()throws JFCValidationException
	{
	
		System.out.println("Enter the value for Password (min 8 char) : ");
		String password = takeInput("Password");
		
		if(password.length()<8)
		{
			// raise exception
			throw new JFCValidationException("password");
		}
		System.out.println("Enter the User Email : ");
		String email =takeInput("Email");
		
		if(!email.contains("@"))
		{
			// raising exception
			throw new JFCValidationException("Email");
		}
		
		
	}
	
	
}
