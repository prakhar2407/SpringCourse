package org.example3;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
