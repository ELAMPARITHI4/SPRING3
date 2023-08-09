package com.dailycode.employee.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dailycode.employee.model.Employee;

@Repository
public class EmployeeRepo {

	private List<Employee> listEmployee = new ArrayList<>();
	
	 public Employee addDepartment(Employee employee)
	 {
		 listEmployee.add(employee);
		 return employee;
	 }
	 
	 public Employee getEmployeeByid(Long id)
	 {
		 return listEmployee.stream().filter(emp->emp.id().equals(id)).findFirst().orElseThrow();
		 
	 }
	 
	 public List<Employee> getEmployeeAll()
	 {
		 return listEmployee;
		 
	 }
	 
	 public  List<Employee> getEmployeeByDepid(Long id)
	 {
		 return listEmployee.stream().filter(emp->emp.departmentId().equals(id)).toList();
		 
	 }
}
