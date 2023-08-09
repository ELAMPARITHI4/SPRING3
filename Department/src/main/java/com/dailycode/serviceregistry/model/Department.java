package com.dailycode.serviceregistry.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
	

	private Long id;
	private String name;

	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	
	private List<Employee> employee = new ArrayList<>();

	public Department(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employee=" + employee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(employee, other.employee) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
