package p1;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

	private int empCode;
	private String name;
	private int salary;
	private String designation;
	private String projectName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empCode, String name, int salary, String designation, String projectName) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.projectName = projectName;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
	@Override
	public int hashCode() {
		System.out.println(this.empCode+" hashcode called");
		return empCode+name.length();
	}
	
	//  e2.equals(e1)'
	@Override
	public boolean equals(Object obj) {
	
		System.out.println(this.empCode+" inside equals");
	
		if(obj instanceof Employee)
		{
			
			Employee e2 = (Employee) obj; // obj from argument
			Employee e1 = this; // current calling obj 
			
			
			boolean a =  e1.getEmpCode() == e2.getEmpCode();
			boolean b = e1.getDesignation().equals(e2.getDesignation());
			boolean c = e1.getName().equals(e2.getName());
			boolean d = e1.getProjectName().equals(e2.getProjectName());
			boolean e =  e1.getSalary() == e2.getSalary();
			
			return a&&b&&c&&d&&e;
			
			
		}
		else return false;
	}
	
	@Override
	public int compareTo(Employee e) {
		
		return this.empCode - e.empCode;
	}
	@Override
	public String toString() {
		
		return this.empCode+"-"+this.name+" -  "+this.designation+" - "+this.salary;
	}

	
	

}






















