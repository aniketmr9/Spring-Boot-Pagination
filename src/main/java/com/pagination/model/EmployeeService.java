package com.pagination.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void populateEmp() {
		employeeRepo.save(new Employee("A", "T", "M"));
		employeeRepo.save(new Employee("B", "T", "M"));
		employeeRepo.save(new Employee("C", "T", "M"));
		employeeRepo.save(new Employee("D", "T", "M"));
		employeeRepo.save(new Employee("E", "T", "M"));
		employeeRepo.save(new Employee("F", "T", "M"));
	}
}
