package com.ICI.loan.carloan;

public abstract class FirstAbstract1 {
	
	int x = 100;
	

	public void m1() 
	{
		System.out.println("I am Absreact m1 ");
	}
	
	public abstract void m3();
	
	public static void main(String[] args)
	{
		
		FirstAbstract1 obj1;
		
		obj1 = new Child1();
		obj1.m1();
		obj1.m3();
		
				
	}
	
}

