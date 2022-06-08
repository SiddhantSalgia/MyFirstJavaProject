package com.globalpayex.college.entities;

public class Professor extends CollegeUser
{
	String[] subjects;
	public Professor(String name, char gender, String[] subjects)
	{
		super(name,gender);
		this.subjects = subjects;
	}
	
	@Override
	public String getDetails() 
	{
		return String.format("Name: %s\nGender: %s\nSubjects: %s", this.fullName,this.gender,this.subjects);
	}
}
