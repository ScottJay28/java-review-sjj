package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    private HourlyEmployee employee;

    @Before
    public void setUp(){
        employee = new HourlyEmployee("Scott",
                LocalDate.of(2022, 01, 2),
                10,
                200);
    }

    @Test
    public void computeMonthlyCompensation_should_return_valid_result() {
        assertEquals(employee.computeMonthlyCompensation(), 2000.0, 0.01);
    }

    @Test
    public void getEmployeeInfo_should_return_valid_info_on_SalariedEmployee() {

        assertEquals("name = Scott, hireDate = 2022-1-2, hourlyRate = 200, hoursWorkedPerMonth = 10",
                employee.getEmployeeInfo());
    }
}