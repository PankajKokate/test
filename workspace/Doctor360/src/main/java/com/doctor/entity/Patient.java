package com.doctor.entity;

public class Patient {
private String name;
private int age;
private String dob;
private String bloodGroup;
private long mobile;
private String email;
private String appointDate;
private String address;
public Patient(String name, int age, String dob, String bloodGroup, long mobile, String email, String appointDate,
		String address) {
	this.name=name;
	this.age=age;
	this.dob=dob;
	this.bloodGroup=bloodGroup;
	this.mobile=mobile;
	this.email=email;
	this.appointDate=appointDate;
	this.address=address;
}
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
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAppointDate() {
	return appointDate;
}
public void setAppointDate(String appointDate) {
	this.appointDate = appointDate;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
