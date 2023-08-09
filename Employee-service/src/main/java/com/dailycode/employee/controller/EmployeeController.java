package com.dailycode.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycode.employee.model.Employee;
import com.dailycode.employee.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/")
	public Employee addDepartment(@RequestBody Employee employee) {
		log.info("inside addDepartment");
		return employeeRepo.addDepartment(employee);
	}

	@GetMapping("/{id}")
	public Employee getEmployeeByid(@PathVariable Long id) {
		log.info("inside getEmployeeByid");
		return employeeRepo.getEmployeeByid(id);
	}

	@GetMapping("/all")
	public List<Employee> getEmployeeAll() {
		log.info("inside getEmployeeAll");

		return employeeRepo.getEmployeeAll();

	}

	@GetMapping("/department/{departmentid}")
	public List<Employee> getEmployeeByDepid(@PathVariable Long departmentid) {
		log.info("inside getEmployeeByDepid");
		return employeeRepo.getEmployeeByDepid(departmentid);

	}
	
	
}
