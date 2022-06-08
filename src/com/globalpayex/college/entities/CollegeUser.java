package com.globalpayex.college.entities;

public class CollegeUser 
{
	public String fullName;
	public char gender;
	public CollegeUser(String fullName, char gender) 
	{
		this.fullName = fullName;
		this.gender = gender;
	}
	
	public String getDetails()
	{
		return String.format("Name: %s\nGender: %s", this.fullName,this.gender);
	}
	
	@Override
	public String toString()
	{
		return String.format("Name: %s\nGender: %s",this.fullName,this.gender);
	}
}
