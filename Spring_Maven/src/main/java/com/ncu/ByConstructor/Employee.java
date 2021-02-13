package com.ncu.ByConstructor;

public class Employee {
    private String employeeName;
    private Department department;
    private Address address;

    public Employee(String employeeName, Department department, Address address) {
        this.employeeName = employeeName;
        this.department = department;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Employee Name : " + employeeName + " , " + department + " , " + address;
    }

}
