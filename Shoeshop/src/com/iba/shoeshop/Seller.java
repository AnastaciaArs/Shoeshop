package com.iba.shoeshop;

import java.util.Date;

public class Seller {
	private String firstName;
	private String secondName;
	private int age;
	private Date startDate;
	private double salary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seller [firstName=").append(firstName)
				.append(", secondName=").append(secondName).append(", age=")
				.append(age).append(", startDate=").append(startDate)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}
	
}
