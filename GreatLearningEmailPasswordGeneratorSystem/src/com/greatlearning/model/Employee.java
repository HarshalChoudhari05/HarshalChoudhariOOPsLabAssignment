package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String departmentName;

	public Employee(String firstName, String lastName, String departmentName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
	}
	/**
	 * Get name of a department for employee
	 * 
	 * @return departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * Set name of a department of employee
	 * 
	 * @param departmentName
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * Get First name of an employee
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set first name of an employee
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get last name of an employee
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set last name of an employee
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
