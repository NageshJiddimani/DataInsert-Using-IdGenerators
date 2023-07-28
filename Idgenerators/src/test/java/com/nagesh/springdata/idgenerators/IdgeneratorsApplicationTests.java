package com.nagesh.springdata.idgenerators;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nagesh.springdata.idgenerators.entities.Employee;
import com.nagesh.springdata.idgenerators.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository er;
	
	@Test
	public void testCreateEmployee() {
		
	    Employee employee = new Employee();
	    employee.setName("Nagesh");
		er.save(employee);
	}

}
