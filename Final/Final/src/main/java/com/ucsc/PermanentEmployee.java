package com.ucsc;

public class PermanentEmployee extends Employee {


    @Override
    public void calculateSalary() {
        double Salary = basicSalary + basicSalary * 0.2 + basicSalary * 0.1;
        System.out.println("Permanent Employee Salary: " + Salary);
    }
}
