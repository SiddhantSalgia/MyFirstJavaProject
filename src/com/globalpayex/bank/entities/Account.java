package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class Account 
{
	double accBalance;
	double accNo;
	String accType;
	public Account(double accNo,double accBalance, String accType)
	{
		this.accNo=accNo;
		this.accBalance=accBalance;
		this.accType=accType;
	}
	
	public double withdraw(double amount) throws MinBalNotMaintainedException 
	{
		try 
		{
			if(amount <= 0)
			{
				throw new IllegalArgumentException("Illegal input!!");
			}
		
			if (this.accBalance-amount<1000)
			{
				//throw an exception to the caller
				//throw new IllegalStateException("Balance can't go below 1000!!");
				throw new MinBalNotMaintainedException("Balance can't go below 1000!!");
			}
		
			this.accBalance-=amount;
			return this.accBalance;
		} finally {
			System.out.println("Transaction ends");
		}
	}
	
	public double diposit(double amount)
	{
		if (amount<=0)
		{
			throw new IllegalArgumentException("Illegal input!!");
		}
		this.accBalance+=amount;
		return this.accBalance;
	}
}
