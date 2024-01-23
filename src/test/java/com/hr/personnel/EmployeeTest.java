package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;


    @Before
    public void setUp() throws Exception {
        // create test target object
        employee = new Employee("Scott", LocalDate.of(2022, 03, 02));
    }

    @Test
    public void getEmployeeInfo_should_return_valid_employee_info_given_valid_employee_info() {


        //call test target method
        String employeeInfo = employee.getEmployeeInfo();

        // verify if the result is what is expected assert
        assertEquals("name = Scott, hireDate =2022-03-02", employeeInfo);
    }

    @Test
    public void work() {

        String work = employee.work();

        assertEquals("Scott is working", work);

    }
}