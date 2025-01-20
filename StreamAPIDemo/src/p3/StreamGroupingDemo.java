package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupingDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Ramesh",1,"Dev","HDFC");
		Employee e2 = new Employee(102,"Suresh",2,"Database","HDFC");
		Employee e3 = new Employee(103,"Rajesh",7,"Seurity","ICICI");
		Employee e4 = new Employee(104,"A",8,"Dev","ICICI");
		Employee e5 = new Employee(105,"B",3,"Seurity","HDFC");
		Employee e6 = new Employee(106,"C",9,"Seurity","SBI");
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		// --- get Total Salary
		
		int totalSalary =  empList.stream().mapToInt(e->{
			return e.getSalary();
		}).sum();
		
		System.out.println(totalSalary);
		
		
		
		// ----- Get Avergae -----------
		
		double avgSalary =  empList.stream().mapToInt(e->{
			return e.getSalary();
		}).average().getAsDouble();
		
		System.out.println(avgSalary);
		
		// ------ Group the total Salary based on Project Name ----
		// approach 1
		Map<String, Integer> map= empList.stream().collect(Collectors.groupingBy(
				Employee::getProjectName,
				Collectors.summingInt(Employee::getSalary)));
		System.out.println(map);
		
		
		// approach 2
		Map<String, Integer> map2= empList.stream().collect(Collectors.groupingBy(
				(e)->{
					return e.getProjectName();
				},
				Collectors.summingInt((e)->{
					return e.getSalary();
				})));
		System.out.println(map2);
		
		
	}
}
