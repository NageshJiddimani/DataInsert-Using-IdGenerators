package com.nagesh.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.nagesh.springdata.idgenerators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
}
