package com.ICI.loan.carloan;

public class ICICI1 implements Rbi1
{

	
	public static void main(String[] args) {
		
	ICICI1 i = new ICICI1();
	
	i.Deposit1();
	i.withdrawl1();

	}

	@Override
	public void withdrawl1() {
		System.out.println("I am override withdrwal from ICICI1");
		
	}

	@Override
	public void Deposit1() 
	{
		System.out.println("I am override Deposit from ICICI1");

		
	}

}
