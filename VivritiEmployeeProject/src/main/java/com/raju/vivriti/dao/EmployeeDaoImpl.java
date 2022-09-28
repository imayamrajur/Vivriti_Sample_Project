package com.raju.vivriti.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.vivriti.module.Employee;
import com.raju.vivriti.repo.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String saveEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
		return "Save Successfully";
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee).getEmployeeId();
		return "Update Successfully";
	}

	@Override
	public Employee updateEmployees(Employee employee, int id) {
		Employee emp =employeeRepository.findById(id).get();
		if(emp!=null) {
		emp.setFirstName(employee.getFirstName());
		employeeRepository.save(emp);
		}
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		Optional<Employee> emp = employeeRepository.findById(empId);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = employeeRepository.findAll();
		return list;
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Successfully Deleted";
	}
	
	

}
