package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class EmployeeSet {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Ramesh",2000,"Dev","aashbf");
		Employee e2 = new Employee(102,"radha",3000,"Database","A");
		Employee e3 = new Employee(103,"Amit Kumar",5000,"Seurity","A");
		
		Employee e4 = new Employee(103,"Amit Kumar",5000,"Seurity","A");
			
		Employee e5 = e1;
		
		Set<Employee> employeeSet = new HashSet<>();
		
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		
		System.out.println("----------Set --------------------");
		for (Employee employee : employeeSet) {
			System.out.println(employee);
		}
		
		
		

		
		
		
	}
}
