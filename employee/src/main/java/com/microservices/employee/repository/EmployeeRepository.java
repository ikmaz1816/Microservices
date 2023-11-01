package com.microservices.employee.repository;

import com.microservices.employee.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    List<Employee> findByDeptId(long id);
}
