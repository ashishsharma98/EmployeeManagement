package com.nagarro.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.models.Employee;

@Service
public interface EmployeeService {

	 Employee addEmployee(Employee emp);

	 List<Employee> getEmployees();

	 Employee updateEmployee(Employee employee, long id);

	 Employee findByEmployeeCode(long id);

	 void deleteEmployee(long id);

}
