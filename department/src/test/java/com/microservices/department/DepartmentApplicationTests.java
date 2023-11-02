package com.microservices.department;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import com.microservices.department.services.DepartmentService;
import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DepartmentApplicationTests {
	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Test
	void getData()
	{
		List<Department> ls=departmentService.getAll();
		for(Department d : ls)
		{
			System.out.println(d);
		}
	}

}
