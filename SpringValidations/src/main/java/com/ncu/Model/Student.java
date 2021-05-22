package com.ncu.Model;

import com.ncu.Validator.CourseCode;
import com.ncu.Validator.SpecialCharacter;
import com.ncu.Validator.StrongPassword;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

public class Student {
    @NotNull
    @Size(min = 4,message = "greater then 4")
    private String fname;
    private String lname;

    @CourseCode
    private String courseCode;

    @StrongPassword
    @SpecialCharacter
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
