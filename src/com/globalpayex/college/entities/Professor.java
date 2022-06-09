package com.globalpayex.college.entities;
import com.abc.salary.SalariedInd;

public class Professor extends CollegeUser
{
	String[] subjects;
	double costPerDay;
	int workingDays;
	
	public Professor(String name, char gender, String[] subjects, double costPerDay, int workingDays)
	{
		super(name,gender);
		this.subjects = subjects;
		this.costPerDay = costPerDay;
		this.workingDays = workingDays;
	}
}
