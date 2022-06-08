package com.globalpayex.college.entities;

public class Student extends CollegeUser
{
	
	int roll;
	double marks;
	public Student(String name, char gender, int roll, double marks) 
	{
		super(name,gender);
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public String getDetails()
	{
		// TODO Auto-generated method stub
		return String.format("Name: %s\nGender: %s\nMarks: %s\nRoll: %s", this.fullName,this.gender,this.marks,this.roll);
	}
	
	
}
