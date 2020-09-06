package com.ICI.loan.carloan;

public class Third3Class {
	
	int a=10,b=20,c; //Properties 
	public void add()
	
	{
		
		c=a+b;
		System.out.println("A+B is:"+c);
				
	}
	
	public void sub() {
		
		c=a-b;
		System.out.println("A-B is:"+c);
	}
public void mul() {
		
		c=a*b;
		System.out.println("A*B is:"+c);
	}
	
	public static void main(String[] args) {
		
		Third3Class obj = new Third3Class(); 
		obj.add();
		obj.sub();
		obj.mul();

		Third3Class obj1 = new Third3Class();
			obj1.add();
			obj1.mul();
			
	}

}
