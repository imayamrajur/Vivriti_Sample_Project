package com.raju.vivriti.dao;

import java.util.List;
import java.util.Optional;

import com.raju.vivriti.module.Employee;

public interface EmployeeDao {

	String saveEmployee(Employee employee);

	String updateEmployee(Employee employee);

	Employee updateEmployees(Employee employee, int id);

	Optional<Employee> getEmployee(int empId);

	List<Employee> getAllEmployee();

	String deleteEmployee(int id);

}
