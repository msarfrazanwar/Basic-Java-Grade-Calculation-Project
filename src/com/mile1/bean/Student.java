package com.mile1.bean;

public class Student {

	String Name;
	int marks[] = new int[3];
	
	public Student () {
		
	}
	
	public Student(String name, int[] marks) {
		super();
		this.Name = name;
		this.marks = marks;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	
	
	
}
