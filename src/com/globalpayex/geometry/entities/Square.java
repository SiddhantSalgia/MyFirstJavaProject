package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;
public class Square extends Shape
{
	int side;
	
	public Square(int side)
	{
		this.side=side;
	}
	
	@Override
	public double area()
	{
		return this.side*this.side;
	}
	
	@Override
	public double perimeter()
	{
		return 4*this.side;
	}
}
