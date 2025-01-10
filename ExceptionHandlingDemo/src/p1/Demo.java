package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Animal
{
	String name = "Dog";
}

public class Demo {

	public static void main(String[] args) {
		
		Animal a = null;
		System.out.println("A");
		
		
				
		try(PrintWriter f = new PrintWriter(new File("edfvs"))) {
			
			System.out.println("B "+a.name);
			
		} 
		catch(Exception e)
		{
			
		}
		finally
		{	
		
			System.out.println("C - End of code");
		}
		
		
		
		
	}
}
