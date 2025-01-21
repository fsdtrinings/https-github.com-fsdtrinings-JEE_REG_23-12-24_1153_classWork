package com.test.app.p3;

public class InvalidDesignationException extends Exception{

	String designationName;

	public InvalidDesignationException(String designationName) {
		super();
		this.designationName = designationName;
	}

	@Override
	public String toString() {
		return "InvalidDesignationException [designationName=" + designationName + "]";
	}
	
	
}
