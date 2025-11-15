package com.ucsc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee();
        pe.employeeID = "E001";
        pe.employeeName = "Grp C";
        pe.basicSalary = 50000;

        System.out.println("Employee ID: " + pe.employeeID);
        System.out.println("Employee Name: " + pe.employeeName);
        System.out.println("Basic Salary: " + pe.basicSalary);
        pe.calculateSalary();
        System.out.println("---------------------------");


        ContractEmployee ce = new ContractEmployee();
        ce.employeeID = "E002";
        ce.employeeName = "Grp C";
        ce.basicSalary = 40000;

        System.out.println("Employee ID: " + ce.employeeID);
        System.out.println("Employee Name: " + ce.employeeName);
        System.out.println("Basic Salary: " + ce.basicSalary);
        ce.calculateSalary();


    }
}