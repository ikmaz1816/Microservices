package com.microservices.employee.service;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getById(long id)
    {
        return employeeRepository.findById(id).get();
    }
    public List<Employee> getAll()
    {
        return  (List<Employee>)employeeRepository.findAll();
    }

    public List<Employee> getByDepartmentId(long id)
    {
        return employeeRepository.findByDeptId(id);
    }
}
