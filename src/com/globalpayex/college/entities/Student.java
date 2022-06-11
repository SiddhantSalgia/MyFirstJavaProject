package com.globalpayex.college.entities;

public class Student extends CollegeUser
{
	
	public int roll;
	public double marks;
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

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}
	
}
