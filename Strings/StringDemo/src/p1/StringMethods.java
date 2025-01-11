package p1;

public class StringMethods {

	public static void main(String[] args) {
		
		StringMethods obj = new StringMethods();
		//obj.subStringDemo();
		//obj.trimDemo();
		//obj.endWithDemo();
		obj.splitDemo();
	}
	
	public void splitDemo()
	{
		String s = "vhgaavsdhcbaajrffdgtrdaabrty";
		String otherString[] = s.split("aa");// random logic
		for (String a : otherString) {
			System.out.println(a);
		}
	}
	
	public void endWithDemo()
	{
		String email = "ashish@gmail.com";
		boolean isValid = email.endsWith(".com");
		System.out.println(isValid);
	}
	
	public void trimDemo()
	{
		String s = "   a   ";
		System.out.println(s.length());
		s = s.trim();
		System.out.println(s.length());
		
	}
	
	public void subStringDemo()
	{
		String s = "0123456789"; 
		String output = s.substring(4, 8);
		System.out.println(output);
		
	}
	
	
	
}
