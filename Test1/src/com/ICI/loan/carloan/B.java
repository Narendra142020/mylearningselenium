package com.ICI.loan.carloan;

public class B extends A
{

	//public void m1() 
	//{
		//System.out.println("I am override of m1 A");
		
	//}
	public void m2() 
	{
		System.out.println("I am m2 from B");
		
	}
	
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.m1();
		obj.m2();
		

	}

}
