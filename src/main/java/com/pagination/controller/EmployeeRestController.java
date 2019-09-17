package com.pagination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pagination.model.Employee;
import com.pagination.model.EmployeeRepo;
import com.pagination.model.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeeRepo empRepo;
	@RequestMapping("")
	public void populateEmp() {
		empService.populateEmp();
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("/list")
	public Page<Employee> epm(@RequestParam(defaultValue = "0") int page) {
		return empRepo.findAll(new PageRequest(page, 4));
	}
}
