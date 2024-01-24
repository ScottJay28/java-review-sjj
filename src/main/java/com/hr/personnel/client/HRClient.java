
package com.hr.personnel.client;

import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.Department;


import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee semployee1 = new SalariedEmployee("Mike", LocalDate.of(2020, 3, 2), 4000.0);
        Employee semployee2 = new SalariedEmployee("Joe", LocalDate.of(2022, 3, 3), 3000.0);
        Employee hemployee1 = new HourlyEmployee("Kim", LocalDate.of(2023, 8, 10), 160, 30.0);





        Department dept = new Department("engineering", "Boston");
        dept.addEmployee(semployee1);
        dept.addEmployee(semployee2);
        dept.addEmployee(hemployee1);

        semployee1.work();
        semployee2.work();
        hemployee1.work();


        dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();


        double monthlyTotalCompensation = dept.computeDepartmentMonthlyTotalCompensation();
        System.out.println("monthly total compensation = " + monthlyTotalCompensation);


    }
}
