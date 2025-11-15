package com.ucsc;

public class ContractEmployee extends Employee {

    @Override
    public void calculateSalary() {
        double Salary = basicSalary - basicSalary * 0.5;
        System.out.println("Contract Employee Salary: " + Salary);

    }
}
