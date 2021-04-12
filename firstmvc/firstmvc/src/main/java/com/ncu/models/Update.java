package com.ncu.models;

import java.sql.Date;

public class Update {
	

	
	private String userid;
	private String pwd;
	private String email;
	private int age;
	private String gender;
	private Date dob;
	private String area;
	private String state;
	private String country;
	
	
	public Update() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	



	public Update(String userid, String pwd, String email, int age, String gender, String area, String state,String country) {
		
		this.userid = userid;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
		this.gender = gender;
		
		this.area = area;
		this.state = state;
		this.country = country;
	}







	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
