package com.seleniumexpress.spring.DependencyInjection;

public class Student {

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int id) {
	
		this.id = id;
	}

	private String studentName;
	
	private int id;
	public void displayInfo() {
		System.out.println("name is :" + studentName + " and id is :" + id);
	} 
}
