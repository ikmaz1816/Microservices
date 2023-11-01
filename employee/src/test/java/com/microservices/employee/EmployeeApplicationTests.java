package com.microservices.employee;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {
	@Autowired
	private EmployeeService employeeService;

	@Test
	void checkForAll()
	{
		Employee emp=employeeService.getById(1);
		System.out.println(emp);
	}

}
