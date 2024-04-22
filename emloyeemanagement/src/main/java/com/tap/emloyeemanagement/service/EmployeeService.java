package com.tap.emloyeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tap.emloyeemanagement.Entity.Employee;
import com.tap.emloyeemanagement.repository.EmployeeRepository;

@Service // Indicate that class represents a service component in
		 // in the application. used to classes that contains
		 // business logic.
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> saveEmployees(List<Employee> employees) {
		return repository.saveAll(employees);
	}

	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		return repository.findById(employeeId).orElse(null);
	}

	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee emp = repository.findById(employee.getEmployeeID()).orElse(null);
		emp.setEmployeeName(employee.getEmployeeName());
		emp.setEmployeeAge(employee.getEmployeeAge());
		emp.setEmployeePhoneNumber(employee.getEmployeePhoneNumber());
		emp.setEmployeeAddress(employee.getEmployeeAddress());
		emp.setCity(employee.getCity());
		emp.setCountry(employee.getCountry());
		emp.setEmployeeJobTitle(employee.getEmployeeJobTitle());	
		emp.setEmployeeSalary(employee.getEmployeeSalary());
		return repository.save(emp);
	}

	public String deleteEmployee(int employeeId) {

		repository.deleteById(employeeId);
		return "Deleted User "+employeeId;
	}


}
