package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee  extends Employee{
   private int hoursWorkedPerMonth;
   private double hourlyRate;
   private LocalDate hireDate;


    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
      setHourlyRate(hourlyRate);
      setHoursWorkedPerMonth(hoursWorkedPerMonth);


    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public LocalDate getHireDate(){

        return hireDate;
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    @Override
    public String getEmployeeInfo() {
        return "name = " + getName() + ", "
                + "hireDate = " + getHireDate() + ", "
                + "hourlyRate = " + getHourlyRate() + ", "
                + "hoursWorkedPerMonth = " + getHoursWorkedPerMonth();
    }


    @Override
    public double computeMonthlyTaxToPay() {
        double hourlyTaxesToPay = hourlyRate * hoursWorkedPerMonth * HOURLY_TAX_RATE;
        return hourlyTaxesToPay;
    }
}