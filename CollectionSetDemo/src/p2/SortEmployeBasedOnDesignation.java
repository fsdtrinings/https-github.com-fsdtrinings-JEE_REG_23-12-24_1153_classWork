package p2;

import java.util.Comparator;

import p1.Employee;

public class SortEmployeBasedOnDesignation implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getDesignation().compareTo(o2.getDesignation());
	}

	
	
}
