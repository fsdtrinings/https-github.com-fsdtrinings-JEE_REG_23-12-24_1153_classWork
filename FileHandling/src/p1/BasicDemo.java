package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class BasicDemo {

	public static void main(String[] args) {
		
		/* read numbers from file f1 , and print the output in f2*/
	
		String path = "C:\\Users\\Ashish\\Desktop\\Banglore 23 Dec 1153 Batch\\numbers.txt";
		File f1 = new File(path);
		
		String path2 = "C:\\Users\\Ashish\\Desktop\\Banglore 23 Dec 1153 Batch\\SumOutput.txt";
		File f2 = new File(path2);
		
		
		int sum = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line = "";
			while((line = br.readLine())!=null)
			{
				int x = Integer.parseInt(line);
				sum+=x;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		try {
			 boolean status = f2.createNewFile();
			
			 if(status == true && f2.exists())
			 {
				 PrintWriter pw = new PrintWriter(new FileWriter(f2));
				 pw.print(sum);
				 pw.close();
				 System.out.println(" Output file Created ");
			 }
			 else
			 {
				 System.out.println("File Creation Problem , Check with Admin");
			 }
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
