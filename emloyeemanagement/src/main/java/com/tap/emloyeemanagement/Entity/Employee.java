package com.tap.emloyeemanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int EmployeeID;
	private String EmployeeName;
	private int EmployeeAge;
	private long EmployeePhoneNumber;
	private String EmployeeAddress;
	private String City;
	private String Country;
	private long EmployeeSalary;
	private String EmployeeJobTitle;
	
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
	public long getEmployeePhoneNumber() {
		return EmployeePhoneNumber;
	}
	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		EmployeePhoneNumber = employeePhoneNumber;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public long getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getEmployeeJobTitle() {
		return EmployeeJobTitle;
	}
	public void setEmployeeJobTitle(String employeeJobTitle) {
		EmployeeJobTitle = employeeJobTitle;
	}
	
	
		
	public Employee() {
	}
	
	public Employee(int employeeID, String employeeName, int employeeAge, long employeePhoneNumber,
			String employeeAddress, String city, String country, long employeeSalary, String employeeJobTitle) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeAge = employeeAge;
		EmployeePhoneNumber = employeePhoneNumber;
		EmployeeAddress = employeeAddress;
		City = city;
		Country = country;
		EmployeeSalary = employeeSalary;
		EmployeeJobTitle = employeeJobTitle;
	}
	
	
	
}
