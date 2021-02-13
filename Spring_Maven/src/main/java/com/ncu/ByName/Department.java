package com.ncu.ByName;

public class Department {
    private String deptName;

    @Override
    public String toString(){
        return "Department Name : "+deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
