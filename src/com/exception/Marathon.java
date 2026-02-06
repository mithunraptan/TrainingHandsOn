package com.exception;


public class Marathon {
	
	String name;
	int age;
	String gender;
	long number;
	
	public Marathon(String name, int age, String gender, long number) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	

}
