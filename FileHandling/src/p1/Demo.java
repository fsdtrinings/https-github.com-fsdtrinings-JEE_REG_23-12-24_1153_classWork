package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Demo {
	
	String path = "C:\\Users\\Ashish\\Desktop\\Banglore 23 Dec 1153 Batch\\emails.txt";
	File f;
	
	Demo()throws IOException
	{
		f = new File(path);
	}
	
	public static void main(String[] args) {
		try {
			
			Demo d = new Demo();
			Map<String, List<String>> map = d.readFile();
	
			d.writeIntoFile(map.get("cg"));
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	
	public void writeIntoFile(List<String> allUsers)throws IOException
	{
		
		String path = "C:\\Users\\Ashish\\Desktop\\Banglore 23 Dec 1153 Batch\\cgusername.txt";
		File f = new File(path);
		
		
		PrintWriter pw = new PrintWriter(new FileWriter(f, true));
		
		for (String username : allUsers) {
			pw.print(username);
			pw.print("\n");
		}
		
		pw.close();
		System.out.println(" --- End ----");
		
		
	}
	
	
	
	
	public Map<String, List<String>> readFile()throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line = "";
		
		Map<String, List<String>> mailGroupMap = new HashMap<>();
		 // domain , all emails
		
		while( (line = br.readLine()) != null  )
		{
			
			String arr[] = line.split("@");
			if(arr.length == 2)
			{
				String username = arr[0];
				String domain = arr[1].split("\\.")[0];
				          //    gmail.com [gamil, com]
				
				// code to insert into map
				List<String> list = mailGroupMap.get(domain);
				if(list != null)
				{   // list already available in the map
					list.add(username);
					mailGroupMap.put(domain, list);
				}
				else
				{
					// new List creation
					List<String> newList = new ArrayList<>();
					newList.add(username);
					mailGroupMap.put(domain, newList);
				}
				
			}
			else
			{
				//throw new WrongEmailException();
			}
		}
		
		// ---4
		System.out.println(mailGroupMap);
		return mailGroupMap;
	}
	
	
}













