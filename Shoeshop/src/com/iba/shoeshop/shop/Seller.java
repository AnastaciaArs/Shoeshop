package com.iba.shoeshop.shop;

import java.util.Date;

public class Seller {
	private String firstName;
	private String secondName;
	private Date startDate;
	private double salary;
	
	public Seller(String firstName, String secondName, Date startDate,
			double salary) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.startDate = startDate;
		this.salary = salary;
	}
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
				.append(", secondName=").append(secondName)
				.append(", startDate=").append(startDate)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}
	
}
