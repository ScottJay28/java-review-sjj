
package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", LocalDate.of(2020, 03, 02));
        Employee employee2 = new Employee("Joe", LocalDate.of(2022, 03, 03));
        String employeeInfo = employee.getEmployeeInfo();

        System.out.println(employeeInfo);
        System.out.println(employee2.getEmployeeInfo());
        System.out.println(employee.work());
        System.out.println(employee2.work());
    }
}
