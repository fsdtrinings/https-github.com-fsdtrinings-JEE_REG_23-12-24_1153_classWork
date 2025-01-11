package re;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegExaDemo {

	public void basicUnderstanding()
	{
		  //Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Pattern class check the regular expression first
	      
		
		
		
			Pattern pattern = Pattern.compile("[A-Z]{3}"); // Pattern class check the regular expression first
			// validate the regular exp
		       
	        Matcher matcher = pattern.matcher("abc"); // class checks the String based on regular expression
	        boolean b = matcher.find(); // this methods validates our string based on the regular expression
	        System.out.println(b);
	}

	
	public void validateEmailId()
	{
		String input1 = "amit@gmail.com";
		String input2 = "a.kumar12@gmail.com";
		String input3 = "amit123@outlook.com";
		String input4 = "amit1.kumar@cg.com";
		String invalidInput1 = "1a@isro.org";
		String invalidInput2 = "1amitgfefer.com";
		
		
		String reqExpEmail = "[a-zA-Z]{1}[0-9A-Za-z\\.]+[@][a-zA-Z]{2,}[\\.][a-z]{3}";
		
		Pattern pattern = Pattern.compile(reqExpEmail); 
	       
        Matcher matcher = pattern.matcher(invalidInput1); 
        boolean b = matcher.find(); 
        System.out.println(b);
		
	}
	
	
	
	public void validateCarNumber()
	{
		// first two characters followed by 1 digit and 1 char followed by 4 digits
	 // \n , \t
		// KA-1B-7890
		String carRegEx = "[A-Z]{2}[\\-][0-9]{1}[A-Z]{1}[\\-][0-9]{4}";
		String input1 = "KA-1B-7890";
		String input2 = "AP1B1290"; // AP-1B-1290
		String input3 = "APB11290";
		
		Pattern pattern = Pattern.compile(carRegEx); 
	       
        Matcher matcher = pattern.matcher(input1); 
        boolean b = matcher.find(); 
        System.out.println(b);
		
	}
	
	public static void main(String[] args) 
	{
		RegExaDemo obj = new RegExaDemo();
		obj.validateEmailId();
		
		
	}
}
