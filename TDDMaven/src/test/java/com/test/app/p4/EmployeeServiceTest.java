package com.test.app.p4;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.test.app.p1.Employee;
import com.test.app.p3.EmployeeNotFoundException;

public class EmployeeServiceTest {

	
	EmployeeService empService;
	
	@Before
	public void doTestPrepration()
	{
		empService = new EmployeeService();
	}
	
	@Test
	@DisplayName("Update Salary Test ")
	public void testUpdateSalary() {
		
		int sampleEmployeeId = 101;
		int sampleIncreement = 5;
		
		/* -- Sample Data for Expected Output ---*/
		Employee e1 = new Employee(101, "Ramesh", 2000, "SE", "aashbf");
		int sal = e1.getSalary();
		int increementAmount = (int) (sal * sampleIncreement) / 100;
		e1.setSalary(sal + increementAmount);
		
		// ---- Actual method call ---
		Employee actualOutput = null;
		try {
			actualOutput = empService.updateSalary(sampleEmployeeId, sampleIncreement);
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		assertEquals(e1, actualOutput);
		
	}

	@Test
	@DisplayName("NegativeTest Throw NoSuchElementException during Updating Salary")
	public void testUpdateSalaryTestException() {
		
		int sampleEmployeeId = 7777;
		
		
		 assertThrows(NoSuchElementException.class, () -> {
			 empService.updateSalary(sampleEmployeeId, 10);
	     });
		
	}
	@Test
	public void testSearchEmployeeInt() {
		
		int sampleInput = 101;
		Employee expectedOutput = new Employee(101, "Ramesh", 2000, "SE", "aashbf");
		
		Employee actualOutput = empService.searchEmployee(sampleInput);
		assertEquals(expectedOutput, actualOutput);
	}
	
	
	



	@Test
	public void testAddEmployee() {
		List<Employee> allreadyList = empService.getAllEmployees();
		
		Employee sampleEmployee = new Employee(1, "test", 1);
		
		// --- executing actual method
		
		empService.addEmployee(sampleEmployee);
		List<Employee> updatedList = empService.getAllEmployees();
		
		assertEquals(7, updatedList.size());
		assertTrue(updatedList.contains(sampleEmployee));
		
		
	}

}
