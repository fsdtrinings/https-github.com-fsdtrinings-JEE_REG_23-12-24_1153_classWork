package com.xyz.app.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.xyz.app.entity.Employee;
import com.xyz.app.entity.Project;

public class EmployeeUtil {
	
	//  designation 
	Map<String, List<Employee>> employeeMap;
	
	public Map<String,Integer> getEmployeeBased(String designation,String projectName)
	{
		// Count employee based on designation & project name
		return null;
	}
	
	public List<Employee>  getAllEmployeesBasedOnDesignation(String searchDesignation)
	{
		return employeeMap.get(searchDesignation);
	}
	
	public void addEmployee(String designation,Employee e)
	{
		List<Employee> allEmployees = employeeMap.get(designation);
	
		if(allEmployees == null || allEmployees.isEmpty() == true)
		{
			// create new list and insert into map
			List<Employee> empList = new ArrayList<>();
			empList.add(e);
			employeeMap.put(designation, empList);
		}
		else
		{
			// update employee into list 
			allEmployees.add(e);
		}
	
	}
	
	
}
