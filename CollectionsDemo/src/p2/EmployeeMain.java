package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeMain {

	List<Employee> allEmployees = new ArrayList<>();
	public static void main(String[] args) {
		
	
		EmployeeMain mainApp = new EmployeeMain();
		//allEmployees.add(101,"Ramesh",2000,"Dev","aashbf");
		// this will give an error  
		
		Employee e1 = new Employee(101,"Ramesh",2000,"Dev","aashbf");
		Employee e2 = new Employee(102,"Suresh",3000,"Database","A");
		Employee e3 = new Employee(103,"Rajesh",5000,"Seurity","A");
		
		
		mainApp.allEmployees.add(e1);
		mainApp.allEmployees.add(e2);
		mainApp.allEmployees.add(e3);
		
		
		mainApp.addEmployee();
		mainApp.doPrint();
	}
	
	public void doPrint() {
		for (Employee employee : allEmployees) 
		{
			if(employee.getProjectName().equals("A"))
			{
				System.out.println(employee);
			}
		}
		
	}
	
	public void addEmployee()
	{
		System.out.println("Enter emp Name ");
		String name = new Scanner(System.in).nextLine();
		
		System.out.println("Enter emp Salary ");
		int salary = new Scanner(System.in).nextInt();
		
		int empCode = new Random().nextInt(100);
		
		Employee temp = new Employee(empCode, name, salary,null, null);
		
		allEmployees.add(temp);
		
	}
}



















