package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamAPIDemo2 {

	List<Employee> empList = new ArrayList<>();
	
	public StreamAPIDemo2() {
		Employee e1 = new Employee(101,"Ramesh",200,"Dev","aashbf");
		Employee e2 = new Employee(102,"Suresh",3000,"Database","A");
		Employee e3 = new Employee(103,"Rajesh",15000,"Seurity","A");
		Employee e4 = new Employee(104,"A",6000,"Dev","baedsw");
		Employee e5 = new Employee(105,"B",11000,"Seurity","wefe");
		Employee e6 = new Employee(106,"C",5000,"Seurity","A");
		
		empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
	}
	
	
	public void sortEmployeeBySalary()
	{
		empList.stream().sorted((a,b)->{
			return a.getSalary() - b.getSalary();
		}).forEach(System.out::println);
		
	}
	
	
	public void printAllEmployee()
	{
		empList.stream().forEach(e->{
			System.out.println(e);
		});
	}
	
	public void filterEmployeesBasedOnSalary()
	{
		empList.stream().filter((e)->{
			if(e.getSalary()>5000) return true;
			else return false;
		}).forEach(e->{
			System.out.println(e);
		});
	}
	
	public List<Employee> changeSalary()
	{
		List<Employee>  outputList	=   empList.stream().filter((e)->{
			if(e.getSalary()>5000) return true;
			else return false;
		}).   
		map(e->{
			int oldSalary = e.getSalary();
			e.setSalary(oldSalary+1);
			return e;
		})
		.
		collect(Collectors.toList());
		
		return outputList;
	}
	
	
	public static void main(String[] args) {
		StreamAPIDemo2 obj = new StreamAPIDemo2();
		
		obj.printAllEmployee();
		System.out.println("------------------------------------------");
		obj.filterEmployeesBasedOnSalary();
		System.out.println("------------------------------------------");
		List<Employee> abc = obj.changeSalary();
		for (Employee e : abc) {
			System.out.println(e);
		}
		System.out.println("-------------------Sort-----------------------");
		obj.sortEmployeeBySalary();
		
	}
}
