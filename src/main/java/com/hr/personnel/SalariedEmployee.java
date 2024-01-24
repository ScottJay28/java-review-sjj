package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    double monthlySalary;
    private LocalDate hireDate;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        setMonthlySalary(monthlySalary);
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " +  getName() + ", "
                + "hireDate = " + getHireDate() + ", "
                + "monthlySalary = " + getMonthlySalary();
    }

    private LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        double salariedTaxesToPay = monthlySalary * SALARIED_TAX_RATE;
        return salariedTaxesToPay;
    }
}

