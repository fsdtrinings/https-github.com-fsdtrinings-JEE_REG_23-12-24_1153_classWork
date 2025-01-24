package com.test.app.p1;

import java.util.Objects;

public class TimeSheet {

	private int hours; // >54 < 60
	private boolean status; // false
	public TimeSheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TimeSheet(int hours, boolean status) {
		super();
		this.hours = hours;
		this.status = status;
	}
	public TimeSheet(int hours) {
		super();
		this.hours = hours;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hours, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeSheet other = (TimeSheet) obj;
		return hours == other.hours && status == other.status;
	}
	@Override
	public String toString() {
		return "TimeSheet [hours=" + hours + ", status=" + status + "]";
	}
	
	
}
