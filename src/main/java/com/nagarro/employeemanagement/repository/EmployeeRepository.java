package com.nagarro.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.employeemanagement.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	 Employee findByEmployeeCode(long id);

}
