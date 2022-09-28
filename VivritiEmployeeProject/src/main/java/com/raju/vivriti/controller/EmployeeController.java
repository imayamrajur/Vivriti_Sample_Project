package com.raju.vivriti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.vivriti.average.AverageInteger;
import com.raju.vivriti.module.Employee;
import com.raju.vivriti.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	AverageInteger averageInteger;

	@PostMapping("/register")
	public String saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@PatchMapping("/updates/{id}")
	public Employee updateEmployees(@RequestBody Employee employee, @PathVariable("id") int id) {
		return employeeService.updateEmployees(employee, id);
	}
	
	@GetMapping("/findOne/{empId}")
	public Optional<Employee> getEmployee(@PathVariable("empId") int empId){
		return employeeService.getEmployee(empId);
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);		
	}
	
	@GetMapping("/avg")
	public int getAverageValue() {
		return averageInteger.getAverageValue();		
	}

}
