package com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;

    //private Employee[] employees = new Employee[100];
    private List<Employee> employees = new ArrayList<>();

    private int numberOfEmployeesWhoWorked;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }



    public void addEmployee(Employee employee) {
        employees.add(employee);


        }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        int numberOfEmployeesWhoWorked = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).work().equals(employees.get(i).getName() + " is working")) {
                numberOfEmployeesWhoWorked++;
            }
        }
        return numberOfEmployeesWhoWorked;
    }



    public double computeDepartmentMonthlyTotalCompensation() {
        double monthlyTotalCompensation = 0.0;

        for (int i = 0; i < employees.size(); i++) {
            monthlyTotalCompensation
                    += employees.get(i).computeMonthlyCompensation();
        }

        return monthlyTotalCompensation;
    }
}