package com.xyz.dbapp;

import java.util.Random;
import java.util.Scanner;

import com.xyz.dbapp.dao.StudentDAO;
import com.xyz.dbapp.entity.Student;

public class MainClass {
	StudentDAO dao = null;
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		boolean status = false;
		try {
			obj.dao = new StudentDAO();
			status = true;
		} catch (Exception e) {
			System.err.println(e);
		}
		
		while(status)
		{
			System.out.println("\n --- MENU -----");
			System.out.println("1. Add Student ");
			System.out.println("2. Search Student by ID");
			System.out.println("3. Search Students By CourseName ");
			System.out.println("0. EXIT ");
			
			switch(obj.sc.nextInt())
			{
				case 1 : 
					obj.addStudent();
					break;
				case 2:
					obj.getStudentbyId();
					break;
				case 3:
					obj.getStudentsByCoursename();
					break;
				case 0 : System.exit(0);
			}
			
		}//end while
	}//end main
	
	public void addStudent()
	{
		System.out.println("Enter Student name ");
		String name = scStr.nextLine();
		
		System.out.println("Enter Student CourseName ");
		String coursename = scStr.nextLine();
		
		System.out.println("Enter Student marks ");
		int marks = sc.nextInt();
		
		int stuid = new Random().nextInt(5000);
		try {
			String notification = dao.saveStudent(stuid, name, coursename, marks);
			if(notification!=null)
			{
				System.out.println(notification);
			}
			else 
			{
				throw new Exception("Error !!! Contact to Admin");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
	}
	
	public void getStudentbyId()
	{
		try {
			System.out.println("Enter Student id ");
			int searchId = sc.nextInt();
			Student s = dao.getStudentFromDBByID(searchId);
			
			if(s!= null)
			{
				System.out.println(s);
			}
			else
			{
				System.out.println(searchId+" Student not available in the DB , Try again");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

		
	}
	public void getStudentsByCoursename()
	{
		
	}
}
