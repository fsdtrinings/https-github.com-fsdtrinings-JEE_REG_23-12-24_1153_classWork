package com.xyz.app;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.xyz.app.entity.Employee;
import com.xyz.app.util.EmployeeUtil;

public class EmployeeMain {

	EmployeeUtil empUtil = new EmployeeUtil();
	
	public static void main(String[] args) {
		
	
		EmployeeMain mainApp = new EmployeeMain();
	  
		
		Employee e1 = new Employee(101,"Ramesh",2000,"Dev","aashbf");
		Employee e2 = new Employee(102,"Suresh",3000,"Database","A");
		Employee e3 = new Employee(103,"Rajesh",5000,"Seurity","A");
		
		mainApp.empUtil.addEmployee(e1);
		mainApp.empUtil.addEmployee(e2);
		mainApp.empUtil.addEmployee(e3);
		
		while(true)
		{
			System.out.println(" --- Web App -----");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee By Id ");
			System.out.println("3. Search Employee By Employee Object");
			System.out.println("4. Change Salary");
			System.out.println("5. Print All Employee ");
			
			
			System.out.println("0. EXIT");
			System.out.println("Enter Input : ");
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				mainApp.takeUserInputForAddingEmployee();
				break;
			case 2 : {
				System.out.println("Enter The Search Employee ID  ");
				int searchid = new Scanner(System.in).nextInt();
				Employee e = mainApp.empUtil.searchEmployee(searchid);
				
				if(e!=null)
				{
					mainApp.doPrint(e);
				}
				else System.out.println(searchid+" Not available ... try again");
			
			}
			break;
			case 5:
			{
				mainApp.doPrint();
				break;
			}

			case 0:
			default:
				System.exit(0);
			}
			
		}//end true
		
		
		
	}//end main
	
	
	public void takeUserInputForAddingEmployee()
	{
		System.out.println("Enter emp Name ");
		String name = new Scanner(System.in).nextLine();
		
		System.out.println("Enter emp Salary ");
		int salary = new Scanner(System.in).nextInt();
		
		int empCode = new Random().nextInt(100);
		
		Employee temp = new Employee(empCode, name, salary,null, null);
		empUtil.addEmployee(temp);
	}
	
	
	
	public void doPrint(Employee e)
	{
		System.out.println(e);
	}
	
	public void doPrint() {
		for (Employee employee : empUtil.getAllEmployees()) 
		{
			
				System.out.println(employee);
			
		}
		
	}
}



















