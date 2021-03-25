package org.example;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    String name;
    int age;
    String address;
    int no_of_days_working;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNo_of_days_working() {
        return no_of_days_working;
    }

    public void setNo_of_days_working(int no_of_days_working) {
        this.no_of_days_working = no_of_days_working;
    }

    public void calculateSalary(int no_of_days_working){
        int salary = no_of_days_working * 2000;
        System.out.println(salary);
    }
}
