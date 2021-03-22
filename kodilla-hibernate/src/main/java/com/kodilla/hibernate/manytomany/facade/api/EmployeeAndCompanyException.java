package com.kodilla.hibernate.manytomany.facade.api;

public class EmployeeAndCompanyException extends Exception {

    public static String ERR_EMPLOYEE_NOT_FOUND = "There is no such employee";
    public static String ERR_COMPANY_NOT_FOUND = "There is no such company";

    public EmployeeAndCompanyException(String message) {
        super(message);
    }
}
