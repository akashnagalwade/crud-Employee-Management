package com.tap.emloyeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tap.emloyeemanagement.Entity.Employee;

@Repository // mark the class as DAO mostly used on class that
			// has databases persistent logic

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{







}
