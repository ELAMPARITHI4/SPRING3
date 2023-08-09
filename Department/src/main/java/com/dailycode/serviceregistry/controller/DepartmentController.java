package com.dailycode.serviceregistry.controller;

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

import com.dailycode.serviceregistry.client.EmployeeClient;
import com.dailycode.serviceregistry.model.Department;
import com.dailycode.serviceregistry.repository.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeClient employeeClient;

	@PostMapping("/")
	public Department addDepartment(@RequestBody Department department) {
		log.info("inside addDepartment Method");
		return departmentRepository.addDepartment(department);
	}

	@GetMapping("/{id}")
	public Department getDepartmentByid(@PathVariable Long id) {
		log.info("inside getDepartmentByid Method" + id);
		return departmentRepository.getDepartmentByid(id);

	}

	@GetMapping("/all")
	public List<Department> getDepartmentAll() {
		log.info("inside getDepartmentAll Method");
		return departmentRepository.getDepartmentAll();

	}

	@GetMapping("/findAllWithEmployee")
	public List<Department> getfindAllWithEmployee() {
		log.info("inside getDepartmentAll Method");
		List<Department> dep = departmentRepository.getDepartmentAll();
		dep.forEach(department -> department.setEmployee(employeeClient.getEmployeeByDepid(department.getId())));
		return dep;
	}

}
