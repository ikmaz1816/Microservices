package com.microservices.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employee {
    @Id
    private long id;

    @Column(nullable=false)
    private long deptId;
    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String position;

}
