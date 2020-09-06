package com.ICI.loan.carloan;

public class Hdfc1 implements Rbi1

{

	public static void main(String[] args) {
		
		Hdfc1 obj4 = new Hdfc1();
			obj4.withdrawl1();
			obj4.Deposit1();


	}

	@Override
	public void withdrawl1()
	{
		
		System.out.println("I am override withdrwal from HDFC1");
	}

	@Override
	public void Deposit1() 
	{
		System.out.println("I am override Deposit from HDFC1");
		
	}

}
