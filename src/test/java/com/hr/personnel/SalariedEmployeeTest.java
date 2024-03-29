package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee employee;

    @Before
    public void setUp(){
        employee = new SalariedEmployee("Scott",
                LocalDate.of(2022, 01, 2), 2000.0);
    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

        assertEquals("name = Scott, hireDate = 2022-1-2, monthlySalary = 2000.0", employee.getEmployeeInfo());
    }

    @Test
    public void computeMonthlyCompensation() {
    }
}