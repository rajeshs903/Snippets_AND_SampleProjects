package com.acc.sampleProj1;

public class Student {

	private String name;
private int rollNo;

	public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayResult()
	{
		System.out.println("Hello "+name);
		System.out.println("roll number is "+rollNo);
	}
}
