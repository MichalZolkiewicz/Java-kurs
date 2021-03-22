package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeAndCompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeAndCompanyFacade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompanyByNameFragment(String nameFragment) throws EmployeeAndCompanyException {

        List<Company> companies = companyDao.retrieveCompanyNameByAnyNameFragment(nameFragment);

        if(companies.size() == 0) {
            LOGGER.error(EmployeeAndCompanyException.ERR_COMPANY_NOT_FOUND);
            throw new EmployeeAndCompanyException(EmployeeAndCompanyException.ERR_COMPANY_NOT_FOUND);
        } else {
            companies.forEach(company -> LOGGER.info("Company found: " + company));
            return companies;
        }
    }

    public List<Employee> searchEmployeeByLastNameFragment(String lastName) throws EmployeeAndCompanyException {

        List<Employee> employees = employeeDao.retrieveEmployeeLastNameByAnyFragment(lastName);

        if(employees.size() == 0) {
            LOGGER.error(EmployeeAndCompanyException.ERR_EMPLOYEE_NOT_FOUND);
            throw new EmployeeAndCompanyException(EmployeeAndCompanyException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            employees.forEach(employee -> LOGGER.info("Employee found: " + employee));
            return employees;
        }
    }

}
