package com.test.app.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.test.app.p1.Employee;
import com.test.app.p1.TimeSheet;
import com.test.app.p3.EmployeeNotFoundException;
import com.test.app.p3.InvalidDesignationException;
import com.test.app.p3.InvalidTimesheetException;
import com.test.app.p4.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeService app = new EmployeeService();

		while (true) {
			System.out.println("\n---------------------------------------------------");
			System.out.println("\n --- MENU ---");
			System.out.println("1. Add Employee.");
			System.out.println("2. Search Employee.");
			System.out.println("3. Update Salary.");
			System.out.println("4. Print All Employee.");
			System.out.println("5. Get Employees by Designation.");
			System.out.println("6. Update Employee Designation");
			System.out.println("7. Set Timesheet");

			System.out.println("0. EXIT");

			System.out.println("Enter Option :- ");
			switch (new Scanner(System.in).nextInt()) {

			case 7: {
				System.out.println("Enter the Search Employee Id : ");
				int searchid = new Scanner(System.in).nextInt();
				
				System.out.println("Enter Timesheet status ");
				String strStatus = new Scanner(System.in).nextLine();
				boolean status = Boolean.parseBoolean(strStatus);
				
				System.out.println("Enter Timesheet Hours");
				int hours = new Scanner(System.in).nextInt();
				
				TimeSheet ts = new TimeSheet(hours, status);
				try {
					 Employee e = app.fillTimeSheet(searchid,ts);
						
					 if(e != null)
					 {
						 app.doPrint(e);
					 }
					 else
					 {
						 System.out.println("Invalid Employee "+searchid);
					 }
				} catch (InvalidTimesheetException e) {
					System.out.println(e);
				}
				
				
				
				}
				break;

			case 1:
				System.out.println("Enter emp Name ");
				String name = new Scanner(System.in).nextLine();

				System.out.println("Enter emp Salary ");
				int salary = new Scanner(System.in).nextInt();

				int empCode = new Random().nextInt(100);
				Employee temp = new Employee(empCode, name, salary);

				app.addEmployee(temp);
				break;

			case 2:
				System.out.println("Enter the Search Employee Id : ");
				int searchid = new Scanner(System.in).nextInt();
				Employee e = app.searchEmployee(searchid);
				app.doPrint(e);
				break;

			case 3:
				System.out.println("Enter the Employee Id : ");
				searchid = new Scanner(System.in).nextInt();
				System.out.println("Enter the Increement % (int-value) : ");
				int increementValue = new Scanner(System.in).nextInt();
				try {
					e = app.updateSalary(searchid, increementValue);
					app.doPrint(e);
				} catch (Exception e2) {
					System.err.println(e2);
				}

				break;
			case 4:
				app.doPrintAllEmp();
				break;

			case 6:
				try {
					System.out.println("Enter the Employee Id : ");
					searchid = new Scanner(System.in).nextInt();

					System.out.println("Enter the Employee Designation : ");
					System.out.println("[\"SE\",\"SSE\",\"PM\",\"TM\",\"HR\",\"VP\",\"admin\"]");
					String designation = new Scanner(System.in).nextLine();

					e = app.updateDesignation(searchid, designation);
					app.doPrint(e);
				} catch (Exception exce) {

					System.err.println(exce);
				} finally {
					break;
				}

			case 0:
			default:
				System.out.println(" *** EXIT ***");
				System.exit(0);
				break;
			}

		} // end while

	}

}
