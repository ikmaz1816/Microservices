package com.microservices.department.controller;

import com.microservices.department.entity.Department;
import com.microservices.department.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAll()
    {
        return departmentService.getAll();
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable("id") long id)
    {
        return departmentService.getById(id);
    }
}
