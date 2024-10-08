package com.kodilla.hibernate.manytomany;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@NamedNativeQuery(
        name="Company.getCompanyByString",
        query = "SELECT * from companies WHERE COMPANY_NAME LIKE CONCAT('%',:COMPANYNAME,'%')",
        resultClass = Company.class
)
@NamedNativeQuery(
        name = "Company.retrieveCompaniesWhoStartsWith",
        query = "Select * from companies where LEFT(COMPANY_NAME,3) = :THREEFIRSTLETTERS",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    List<com.kodilla.hibernate.manytomany.Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<com.kodilla.hibernate.manytomany.Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "COMPANY_NAME", unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
