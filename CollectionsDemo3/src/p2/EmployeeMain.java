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
		Employee e4 = new Employee(104,"A",5000,"Dev","baedsw");
		Employee e5 = new Employee(105,"B",5000,"Seurity","wefe");
		Employee e6 = new Employee(106,"C",5000,"Seurity","A");
		
		
		
		mainApp.allEmployees.add(e1);
		mainApp.allEmployees.add(e2);
		mainApp.allEmployees.add(e3);
		mainApp.allEmployees.add(e4);
		mainApp.allEmployees.add(e5);
		mainApp.allEmployees.add(e6);
		
		
		
		mainApp.addEmployee();
		mainApp.doPrint();
		
		
		Employee e = mainApp.searchEmployee(101);
		mainApp.doPrint(e);
		
	}
	
	
	public Employee searchEmployee(Employee searchEmployee)
	{
		for (Employee employee : allEmployees) {
			
			if(employee == searchEmployee)
			{
				return employee;
			}
		}
		return null;
	}
	
	
	public Employee searchEmployee(int searchId)
	{
		for (Employee employee : allEmployees) {
			if(employee.getEmpCode() == searchId)
			{
				return employee;
			}
		}
		return null;
	}
	
	
	
	
	public void doPrint(Employee e)
	{
		System.out.println(e);
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



















