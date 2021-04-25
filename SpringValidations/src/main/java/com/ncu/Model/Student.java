package com.ncu.Model;

import com.ncu.Validator.CourseCode;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    @NotNull(message = "is required")
    @Size(min = 4,message = "greater then 4")
    private String fname;
    private String lname;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
