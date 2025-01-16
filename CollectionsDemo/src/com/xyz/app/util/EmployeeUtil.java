package com.xyz.app.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.xyz.app.entity.Employee;

public class EmployeeUtil {
	
	List<Employee> allEmployees = new ArrayList<>();

	public List<Employee> getAllEmployees()
	{
		return allEmployees;
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
	
	
	public void addEmployee(Employee temp)
	{
			System.out.println("-->> adding "+temp);
		allEmployees.add(temp);
		
	}
}
