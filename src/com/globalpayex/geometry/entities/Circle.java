package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Circle extends Shape
{
	double radius;
	
	public Circle(double radius) 
	{
		this.radius = radius;
	}

	@Override
	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public double perimeter() 
	{
		return 2*Math.PI*this.radius;
	}	
}
