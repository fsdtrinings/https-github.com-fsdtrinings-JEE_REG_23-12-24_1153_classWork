package com.test.app.p4;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import com.test.app.p1.Employee;
import com.test.app.p1.TimeSheet;
import com.test.app.p3.EmployeeNotFoundException;
import com.test.app.p3.InvalidTimesheetException;

public class EmployeeServiceTest {

	
	EmployeeService empService;
	
	@Before
	public void doTestPrepration()
	{
		empService = new EmployeeService();
	}
	
	
	@Test
	@DisplayName("Adding Time Sheet")
	public void testFillTimeSheet()
	{
		// --- Sample input prepration ---
		int sampleEmpId = 101;
		TimeSheet sampleTS = new TimeSheet(55, false);
		
		
		Employee expectedEmp = new Employee();
		expectedEmp.setEmpCode(101);
		expectedEmp.setName("Ramesh");
		expectedEmp.setSalary(2000);
		expectedEmp.setDesignation("SE");
		expectedEmp.setProjectName("aashbf");
		expectedEmp.setTs(sampleTS);
		
		// execute actual code , method under test
		Employee actualOutput = null; 
		try {
			actualOutput = empService.fillTimeSheet(sampleEmpId, sampleTS);
		} catch (Exception e) {
					}
		
		
		
		assertEquals(expectedEmp, actualOutput);
		
	}
	
	@Test
	@DisplayName("Negative : Adding Time Sheet with Wrong Timesheet Object")
	public void testFillTimeSheetInvalidTimeSheetObject()
	{
		int sampleEmpId = 101;
		TimeSheet sampleTS = new TimeSheet(550, true);
		
		
		Employee expectedEmp = new Employee();
		expectedEmp.setEmpCode(101);
		expectedEmp.setName("Ramesh");
		expectedEmp.setSalary(2000);
		expectedEmp.setDesignation("SE");
		expectedEmp.setProjectName("aashbf");
		expectedEmp.setTs(sampleTS);
		
		// execute actual code , method under test
		
		 assertThrows(InvalidTimesheetException.class, () -> {
			 empService.fillTimeSheet(sampleEmpId, sampleTS);
	     });
		
	}
	
	@Test
	@DisplayName("Negative : Adding Time Sheet with Wrong Employee Id")
	public void testFillTimeSheetInvalidEmployeeId()
	{
		int sampleEmpId = 789456;
		TimeSheet sampleTS = new TimeSheet(550, true);
		
		//"Invalid Employee "+searchid
		
		Employee expectedEmp = new Employee();
		expectedEmp.setEmpCode(101);
		expectedEmp.setName("Ramesh");
		expectedEmp.setSalary(2000);
		expectedEmp.setDesignation("SE");
		expectedEmp.setProjectName("aashbf");
		expectedEmp.setTs(sampleTS);
		
		// execute actual code , method under test
		
		
		Employee actualOutput = null;
		
		try {
			actualOutput = empService.fillTimeSheet(sampleEmpId, sampleTS);
		} catch (Exception e) {
					}
		
		assertNull(actualOutput);
		
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
		e1.setSalary(sal + increementAmount);// 2100
		
		// ---- Actual method call ---
		Employee actualOutput = null;
		try {
			actualOutput = empService.updateSalary(sampleEmployeeId, sampleIncreement);
				actualOutput.setSalary(88);
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
	public void testSearchEmployeeIntNotFound() {
		
		int sampleInput = 2000;
		Employee expectedOutput = null;
		
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

	
	@Test
	@DisplayName("Test ABC")
	public void testgetABC()
	{
		NullPointerException testDep = new NullPointerException();
		String expectingOutput = "ject i";
		String actualOutput = empService.getABC(); // actual execution of code
	
		assertEquals(expectingOutput, actualOutput);
	
	}
	
}























