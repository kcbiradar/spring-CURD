package com.spring.jdbc.entity;

public class Student {
	private int id;
	private String name;
	private String city;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public Student() {
		super();
	}
	
	public Student(int id , String name , String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "student id : " + id + "\n"
				+ "student name : " + name + "\n" + 
				"student city : " + city + "\n";
	}
}
