package com.raju.vivriti.service;

import java.util.List;
import java.util.Optional;

import com.raju.vivriti.module.Employee;

public interface EmployeeService {

	String saveEmployee(Employee employee);

	String updateEmployee(Employee employee);

	Employee updateEmployees(Employee employee, int id);

	Optional<Employee> getEmployee(int empId);

	List<Employee> getAllEmployee();

	String deleteEmployee(int id);

}
