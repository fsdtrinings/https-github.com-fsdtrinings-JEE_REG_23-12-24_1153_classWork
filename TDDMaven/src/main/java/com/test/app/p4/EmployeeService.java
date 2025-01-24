package com.test.app.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

import com.test.app.p1.Employee;
import com.test.app.p1.TimeSheet;
import com.test.app.p3.EmployeeNotFoundException;
import com.test.app.p3.InvalidDesignationException;
import com.test.app.p3.InvalidTimesheetException;

public class EmployeeService {

	List<Employee> allEmployees = new ArrayList<>();

	
	
	public String getABC()
	{
		NullPointerException exp = new NullPointerException("Object is null");
		
		return exp.getMessage().substring(2, 8);
		
	}
	
	
	
	
	public EmployeeService() {
		Employee e1 = new Employee(101, "Ramesh", 2000, "SE", "aashbf");
		Employee e2 = new Employee(102, "Suresh", 3000, "SE", "A");
		Employee e3 = new Employee(103, "Rajesh", 5000, "SSE", "A");
		Employee e4 = new Employee(104, "A", 5000, "PM", "baedsw");
		Employee e5 = new Employee(105, "B", 5000, "VP", "wefe");
		Employee e6 = new Employee(106, "C", 5000, "SSE", "A");

		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		allEmployees.add(e5);
		allEmployees.add(e6);
		System.out.println(allEmployees.size());
	}

	public Employee searchEmployee(int searchId) {
		for (Employee employee : allEmployees) {
			if (employee.getEmpCode() == searchId) {
				return employee;
			}
		}
		return null;
	}
	public Employee fillTimeSheet(int empcode , TimeSheet ts)throws InvalidTimesheetException
	{
		
		Employee e = searchEmployee(empcode);
		if(e!=null)
		{
			if(ts.isStatus() == false && (ts.getHours()>54 && ts.getHours()<60))
			{
				e.setTs(ts);
				return e;
			}
			else 
			{
				throw new InvalidTimesheetException();
			}
		}
		else return null;
	}
	
	
	
	public String fillTimeSheet(int empcode , TimeSheet ts,int x)throws InvalidTimesheetException
	{
		
		Employee e = searchEmployee(empcode);
		if(e!=null)
		{
			if(ts.isStatus() == false && (ts.getHours()>54 && ts.getHours()<60))
			{
				e.setTs(ts);
				
				String output = e.getEmpCode()+" "+e.getName()+" "+e.getTs().getHours();
				
				return output;
			}
			else 
			{
				throw new InvalidTimesheetException();
			}
		}
		else return "Invalid Employee "+empcode;
	}
	 /// invalid employee888
	
	
	
	public boolean validateDesignation(String newDesignation)
	{
		String allValidDesignation[] = {"SE","SSE","PM","TM","HR","VP","admin"};
		
		for (String designation : allValidDesignation) {
			if(designation.equalsIgnoreCase(newDesignation)) return true;
		}
		
		return false;
	}

	public Employee updateDesignation(int searchid,String newDesignation)throws EmployeeNotFoundException,InvalidDesignationException
	{
		Employee e = searchEmployee(searchid);
		if(e == null) throw new EmployeeNotFoundException(searchid);
		
		if(validateDesignation(newDesignation))
		{
			e.setDesignation(newDesignation);
			return e;
		}
		else
		{
			throw new InvalidDesignationException(newDesignation);
		}
	}
	
	public Employee updateSalary(int empid, int increement) throws NoSuchElementException
	{
		Employee result = null;
		
		
		result = allEmployees.stream().filter(e -> {
			if (e.getEmpCode() == empid) //2000
				return true;
			else
				return false;
		}).map(e -> {
			int salary = e.getSalary();
			int increementAmount = (int) (salary * increement) / 100;
			e.setSalary(salary + increementAmount);
			return e;
		}).findAny().get();

		return result;
		// not in case empid is wrong , Stream API throws NoSuchElementException
	}

	public Employee searchEmployee(Employee searchEmployee) {
		for (Employee employee : allEmployees) {

			if (employee == searchEmployee) {
				return employee;
			}
		}
		return null;
	}



	public void doPrint(Employee e) {
		if(e!=null)
			System.out.println(e);
		else System.out.println("Cannot Print Null Value of Employees : "+e); 
			
	}

	public void doPrintAllEmp() {
		for (Employee employee : allEmployees) {
				System.out.println(employee);
			
		}

	}

	public void addEmployee(Employee e) {
		
		
		allEmployees.add(e);
	
	}



	public List<Employee> getAllEmployees() {
		return allEmployees;
	}


}
