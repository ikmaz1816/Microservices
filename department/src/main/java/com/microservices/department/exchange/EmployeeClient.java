package com.microservices.department.exchange;

import com.microservices.department.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/department/{id}")
    public List<Employee> getByDepartmentId(@PathVariable("id") long id);

}
