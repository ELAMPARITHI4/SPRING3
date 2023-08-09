package com.dailycode.serviceregistry.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.dailycode.serviceregistry.model.Employee;

@HttpExchange
public interface EmployeeClient {

	@GetExchange("/employee/department/{departmentid}")
	public List<Employee> getEmployeeByDepid(@PathVariable Long departmentid);
}
