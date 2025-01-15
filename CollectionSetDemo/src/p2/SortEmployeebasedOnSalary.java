package p2;

import java.util.Comparator;

import p1.Employee;

public class SortEmployeebasedOnSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary() - o1.getSalary();
	}

	
}
