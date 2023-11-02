package com.microservices.department.services;

import com.microservices.department.entity.Department;
import com.microservices.department.exchange.EmployeeClient;
import com.microservices.department.interfaces.DepartmentInterface;
import com.microservices.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements DepartmentInterface {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    public Department getById(long id)
    {
        Department dept=departmentRepository.findById(id).get();
        dept.setEmployees(employeeClient.getByDepartmentId(dept.getId()));
        return dept;
    }

    public List<Department> getAll()
    {
        List<Department> ls= (List<Department>)this.departmentRepository.findAll();
        ls.forEach(list->list.setEmployees(employeeClient.getByDepartmentId(list.getId())));
        return ls;
    }

}
