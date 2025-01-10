package ce;

import java.util.Scanner;

public class BusinessProblem {

	public String takeInput(String fieldName)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value for "+fieldName);
		return sc.nextLine();
	}
	
	public static void main(String[] args) {
		BusinessProblem app = new BusinessProblem();
		
		try {
			System.out.println("Enter the value for Password (min 8 char) : ");
			String password = app.takeInput("Password");
			
			if(password.length()<8)
			{
				// raise exception
				throw new JFCValidationException("password");
			}
			else 
			{
				System.out.println("Enter the User Email : ");
				String email = app.takeInput("Email");
				
				if(!email.contains("@"))
				{
					// raising exception
					throw new JFCValidationException("Email");
				}
					
			}
		}
		catch (JFCValidationException e) {
			System.out.println(e.exceptionMsg());
		}
		
		
			
		
		
	}
}
