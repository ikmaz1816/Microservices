package com.microservices.employee.controller;
import com.microservices.employee.entity.Employee;
import com.microservices.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    @ResponseBody
    public Employee getById(@PathVariable("id") long id)
    {
        return employeeService.getById(id);
    }

    @GetMapping("/")
    @ResponseBody
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAll();
    }

    @GetMapping("/department/{id}")
    @ResponseBody
    public List<Employee> getByDepartmentId(@PathVariable("id") long id)
    {
        return (List<Employee>)employeeService.getByDepartmentId(id);
    }
}
