package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Ramesh",1,"Dev","aashbf");
		Employee e2 = new Employee(102,"Suresh",1,"Database","A");
		Employee e3 = new Employee(103,"Rajesh",1,"Seurity","A");
		Employee e4 = new Employee(104,"A",1,"Dev","baedsw");
		Employee e5 = new Employee(105,"B",1,"Seurity","wefe");
		Employee e6 = new Employee(106,"C",1,"Seurity","A");
		
		List<Employee> empList = new ArrayList<>();
		
		empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		int totalSalary =  empList.stream().mapToInt(e->{
			return e.getSalary();
		}).sum();
		
		System.out.println(totalSalary);
		
		
	}
}
