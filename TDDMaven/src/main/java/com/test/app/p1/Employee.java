package com.test.app.p1;

import java.util.Objects;

public class Employee {

	private int empCode;
	private String name;
	private int salary;
	private String designation = "Not Set";
	private String projectName = "Not Set";
	
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
	public Employee(int empCode, String name, int salary) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.salary = salary;
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
		
		return this.empCode+"-"+this.name+" , "+this.designation+" , "+this.projectName+" "+this.salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, empCode, name, projectName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && empCode == other.empCode
				&& Objects.equals(name, other.name) && Objects.equals(projectName, other.projectName)
				&& salary == other.salary;
	}
	

	
	

}
