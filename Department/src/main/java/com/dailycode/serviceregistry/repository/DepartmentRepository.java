package com.dailycode.serviceregistry.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dailycode.serviceregistry.model.Department;

@Repository
public class DepartmentRepository {

	
	private List<Department> listdepartment = new ArrayList<>();
	
	 public Department addDepartment(Department department)
	 {
		 listdepartment.add(department);
		 return department;
	 }
	 
	 public Department getDepartmentByid(Long id)
	 {
		 return listdepartment.stream().filter(dep->dep.getId().equals(id)).findFirst().orElseThrow();
		 
	 }
	 
	 public List<Department> getDepartmentAll()
	 {
		 return listdepartment;
		 
	 }
}
