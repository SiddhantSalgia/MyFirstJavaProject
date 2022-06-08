package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Rectangle extends Shape
{
	int length, bredth;

	public Rectangle(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;
	}
	
	@Override
	public double area()
	{
		return this.length*this.bredth;
	}
	
	@Override
	public double perimeter()
	{
		return 2*(this.length+this.bredth);
	}
}
