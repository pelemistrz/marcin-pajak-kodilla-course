package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyEmployeeFacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyEmployeeFacade companyEmployeeFacade;

    @Test
    void testGetCompanyByString(){
       //given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company softDrinks = new Company("Soft Drinks");
        //when
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(softDrinks);
        //then
        List<Company> companies = companyEmployeeFacade.getCompanyByString("Sof");
            //then
        assertEquals(2, companies.size());
        assertEquals(2,companies.size());
        //finally
        companyDao.deleteAll();
    }

    @Test
    void testGetEmployeeByString(){
      //  given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee samuelSmith = new Employee("Samuel", "Smith");
        //when
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(samuelSmith);
        //then
        List<Employee> employees = companyEmployeeFacade.getEmployeeByString("oh");
        assertEquals(1, employees.size());
        //finally
        employeeDao.deleteAll();
    }

    @Test
    void testGetEmployeeByStringEmpty(){
        //  given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee samuelSmith = new Employee("Samuel", "Smith");
        //when
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(samuelSmith);
        //then
        List<Employee> employees = companyEmployeeFacade.getEmployeeByString("sdafsadfas");
        assertEquals(0, employees.size());
        //finally
        employeeDao.deleteAll();
    }

}