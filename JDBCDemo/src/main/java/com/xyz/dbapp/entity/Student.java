package com.xyz.dbapp.entity;

import java.util.Objects;

public class Student {

	private int stuid;
	private String stuname;
	private int marks;
	private String coursename;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuid, String stuname, int marks, String coursename) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.marks = marks;
		this.coursename = coursename;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public int hashCode() {
		return Objects.hash(coursename, marks, stuid, stuname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(coursename, other.coursename) && marks == other.marks && stuid == other.stuid
				&& Objects.equals(stuname, other.stuname);
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", marks=" + marks + ", coursename=" + coursename
				+ "]";
	}
	
	
}
