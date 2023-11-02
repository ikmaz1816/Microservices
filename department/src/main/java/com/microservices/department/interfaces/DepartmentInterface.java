package com.microservices.department.interfaces;

import com.microservices.department.entity.Department;

import java.util.List;

public interface DepartmentInterface {
     Department getById(long id);


     List<Department> getAll();

}
