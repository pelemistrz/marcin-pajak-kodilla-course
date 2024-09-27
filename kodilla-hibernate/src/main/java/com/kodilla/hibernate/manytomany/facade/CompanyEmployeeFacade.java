package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyEmployeeFacade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;
    @Autowired
    public CompanyEmployeeFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
    public List<Company> getCompanyByString(String companyName) {
        return companyDao.getCompanyByString(companyName);
    }
    public List<Employee> getEmployeeByString(String str) {
        return employeeDao.getEmployeeByString(str);
    }

}
