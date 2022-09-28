package com.raju.vivriti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.vivriti.dao.EmployeeDao;
import com.raju.vivriti.module.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public String saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	@Override
	public String updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Employee updateEmployees(Employee employee, int id) {
		return employeeDao.updateEmployees(employee,id);
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		return employeeDao.getEmployee(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	@Override
	public String deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

}
