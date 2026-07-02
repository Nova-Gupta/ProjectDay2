package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	// Create Employee
	public Employee saveEmployee(Employee employee) {

		String designation = employee.getDesignation().toLowerCase();

		switch (designation) {

		case "programmer":
			employee.setSalary(25000.0);
			break;

		case "manager":
			employee.setSalary(30000.0);
			break;

		case "tester":
			employee.setSalary(20000.0);
			break;

		default:
			throw new IllegalArgumentException("Designation must be Programmer, Manager or Tester");
		}

		return repository.save(employee);
	}

	// Display Employees
	public List<Employee> getAllEmployees() {

		return repository.findAll();

	}

	// Raise Salary
	public Employee raiseSalary(String name, int percentage) {

		if (percentage < 1 || percentage > 10) {

			throw new IllegalArgumentException("Percentage should be between 1 and 10");

		}

		Employee employee = repository.findByName(name)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found"));

		double updatedSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);

		employee.setSalary(updatedSalary);

		return repository.save(employee);

	}

}