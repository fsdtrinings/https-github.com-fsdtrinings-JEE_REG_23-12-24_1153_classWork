package p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import p1.Employee;

public class TreeSetDemoEmployee {

	public static void main(String[] args) {

		TreeSetDemoEmployee demo = new TreeSetDemoEmployee();

		Employee e1 = new Employee(1101, "Ramesh", 2000, "Dev", "aashbf");
		Employee e2 = new Employee(2, "radha", 3000, "Database", "A");
		Employee e3 = new Employee(8103, "Amit Kumar", 5000, "Seurity", "A");

		Employee e4 = new Employee(183, "Suresh", 5005, "Seurity", "A");

		Employee e5 = new Employee(55, "Nagesh", 6000, "Seurity", "A");

		Set<Employee> employeeSet = new TreeSet<>();

		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);

		demo.print(employeeSet, "Default List");

		// -------------------------------

		SortEmployeBasedOnDesignation sortingCode = new SortEmployeBasedOnDesignation();
		List<Employee> list = new ArrayList<>(employeeSet);
		Collections.sort(list, sortingCode);

		demo.print(list, "List based on Designation");

		// -------------------------------

		List<Employee> list2 = new ArrayList<>(employeeSet);
		
		Collections.sort(list2, new SortEmployeebasedOnSalary());

		demo.print(list2, "List Based on Salary");

	}

	public void print(Collection<Employee> set, String tagline) {
		System.out.println("-------" + tagline + "----------");
		for (Employee x : set) {

			System.out.println(x);
		}
	}
}















