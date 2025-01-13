package p2;



public class Employee {

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
	public String toString() {
		
		return this.empCode+"-"+this.name;
	}

	
	

}
