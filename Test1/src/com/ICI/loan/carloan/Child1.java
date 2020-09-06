package com.ICI.loan.carloan;

 public class Child1 extends FirstAbstract1

{
	 
	
		private final  int  x=100;
		
		 
	 

	public static void main(String[] args) 
	{
	Child1 c = new Child1();
	c.m1();
	c.m3();

	}

	
	@Override
	public void m3() 
	{
		System.out.println("I am m2 overriden from child class");
		
	}

	public void m1() 
	{
	System.out.println("Changed the m1");	
	}
	
}
