package com.kodilla.hibernate.manytomany;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name="COMPANIES")
public class Company {
    private int id;
    private String name;
    List<Employee> employees = new ArrayList<>();

    public Company(){}

    public Company(String name) {
        this.name = name;
    }
    @ManyToMany(cascade=CascadeType.ALL, mappedBy = "companies")

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="COMPANY_ID",unique = true)
    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "COMPANY_NAME", unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
