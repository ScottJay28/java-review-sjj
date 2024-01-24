
package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public abstract class Employee implements TaxPayer {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getEmployeeInfo();


    public String work() {

        return name + " is working";
    }

    public abstract double computeMonthlyCompensation();
}
