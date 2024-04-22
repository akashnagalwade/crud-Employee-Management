package com.tap.emloyeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.emloyeemanagement.Entity.Employee;
import com.tap.emloyeemanagement.service.EmployeeService;

@RestController // its a specialised version of @Controller
				// by using this we can find url map

@RequestMapping("emp") // Used to map specific url to method
					   // used on class as well as method level
public class EmployeeController {

	@Autowired // this annotation is used automatically inject 
			   // Dependancy into a spring manage bean
	
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addUser(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	@PostMapping("/addEmployees")
	public List<Employee> addUsers(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
	}
	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {
		return service.getEmployees();
	}

	@GetMapping("/empID/{EmployeeId}")
	public Employee findUserById(@PathVariable int EmployeeId) {
		return service.getEmployeeById(EmployeeId);
	}

	@PutMapping("/updateEmployee")
	public Employee updateUser(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@DeleteMapping("/delete/{EmployeeId}")
	public String deleteUser(@PathVariable int EmployeeId) {
		return service.deleteEmployee(EmployeeId);
	}
	
}
