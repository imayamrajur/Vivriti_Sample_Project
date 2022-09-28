package com.raju.vivriti.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.vivriti.module.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
