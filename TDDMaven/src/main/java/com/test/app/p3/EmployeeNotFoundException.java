package com.test.app.p3;

public class EmployeeNotFoundException extends Exception {

	private int wrongid;
	
	public EmployeeNotFoundException(int wrongid) {
		// TODO Auto-generated constructor stub
		this.wrongid = wrongid;
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException [wrongid=" + wrongid + "]";
	}
	
	
}
