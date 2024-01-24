package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {

    private String name;
    private double monthlyIncome;


    public Corporation(String name, double monthlyIncome){
    setName(name);
    setMonthlyIncome(monthlyIncome);

}
    @Override
    public double computeMonthlyTaxToPay() {
        double corpTaxToPay = monthlyIncome * CORP_TAX_RATE;
        return corpTaxToPay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }


}