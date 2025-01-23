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
import java.util.Random;

/*
 * Application read the file available inside the same package , name "email.txt"
 * 
 * it reads and groups the available emails based on domain name 
 *   
 * write operation create separate files for each domainName , contains username of that domain only
 * 
 * Note : 
 * 1) an email is username@domainName
 * 2) After running the application , refresh the project
 * 3) Change path variable value based on your folder structure 
 *   
 * 
 * */


public class EmailGroupRandomFileCreation {
	
	String path = "C:\\Users\\Ashish\\Desktop\\Banglore 23 Dec 1153 Batch\\bgws\\FileHandling\\src\\p1\\emails.txt";
	
	File f;
	
	EmailGroupRandomFileCreation()throws IOException
	{
		f = new File(path);
	}
	
	public static void main(String[] args) {
		try {
			
			EmailGroupRandomFileCreation d = new EmailGroupRandomFileCreation();
			Map<String, List<String>> map = d.readFile();
	
			d.writeIntoFile(map);
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	
	public void writeIntoFile(Map<String, List<String>> map)throws IOException
	{
		
		String path = "C:\\Users\\Ashish\\Desktop\\Banglore 23 Dec 1153 Batch\\bgws\\FileHandling\\src\\p1\\";
	
		
	
		for (Map.Entry<String, List<String>> entry: map.entrySet()) {
			
			String domainName = entry.getKey();
			List<String> allUsers = entry.getValue();
			
			
			File f = new File(path+""+domainName+".txt");
			
			boolean status = f.createNewFile();
			
			if(f.exists() && status == true)
			{
				FileWriter fw = new FileWriter(f, true);
				PrintWriter pw = new PrintWriter(fw);
				
				for (String user : allUsers) {
					
					pw.print(user+"\n");
					doWait(domainName);
				}
				
				pw.close();
			}
			else
			{
				System.out.println(" Problem in Creating new File "+domainName);
			}
			
			
			
		}
		
		
		
		System.out.println("\n\n --- End ----");
		
		
	}
	
	
	
	
	public Map<String, List<String>> readFile()throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line = "";
		
		Map<String, List<String>> mailGroupMap = new HashMap<>();
		
		
		while( (line = br.readLine()) != null  )
		{
			
			try {
				
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
				else throw new WrongEmailException();
				
				
			} catch (WrongEmailException e) {
				System.out.println(e);
			}
	
		
		}//end while
		
		// ---4
		System.out.println(mailGroupMap);
		return mailGroupMap;
	}
	
	public void doWait(String domain)
	{
		try {
			System.out.println("writing on "+domain+" file");
			int limit = new Random().nextInt(10);
			for(int i=0;i<limit;i++)
			{
				System.out.print(".");
				Thread.sleep(100);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}













