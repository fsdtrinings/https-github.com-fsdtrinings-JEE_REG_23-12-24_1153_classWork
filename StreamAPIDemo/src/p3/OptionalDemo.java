package p3;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> optional1 = Optional.of("Hello");
		Optional<String> optional2 = Optional.ofNullable(null);
		Optional<String> optional3 = Optional.empty();
		
		if (optional1.isPresent()) {
		    System.out.println("Value is present: " + optional1.get());
		    String info = optional1.get();
		    System.out.println(info.toUpperCase());
		}
		System.out.println(" -------");
		System.out.println(optional1);
		System.out.println(optional2);
		System.out.println(optional3);
		
		
		// -------------------
		System.out.println(" --- Employee----");
		Employee e1 = new Employee(101,"Ramesh",200,"Dev","aashbf");
		Employee e2 = null;
		
		Optional<Employee> opEmp1 = Optional.of(e1);
		System.out.println("OpEmp 1 "+opEmp1);
		Optional<Employee> opEmp2 = Optional.ofNullable(e2);
		System.out.println("op EMp 2 "+opEmp2);
		
		if(opEmp1.isPresent())
		{
			System.out.println(opEmp1.get().getName());
		}
		if(opEmp2.isPresent())
		{
			System.out.println(opEmp2.get().getName());
		}
		else
		{
			System.out.println("it will give null pointer exception otherwise");
		}
		
		
		
	}
}
