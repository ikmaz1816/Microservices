package com.microservices.department.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Department {
    @Id
    private long id;

    @Column(nullable = false)
    private String department;

    @OneToMany
    @JoinColumn
     (
       name = "deptId",
       referencedColumnName = "id"
     )
    private List<Employee> employees;
}
