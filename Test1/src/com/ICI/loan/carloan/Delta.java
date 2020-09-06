package com.ICI.loan.carloan;

public class Delta extends ICICI1
{

    int number;
    public String cname;
   
  
 

	public Delta(int number, String cname) 
    {
		this.number = number;
		this.cname = cname;
	}
     
	public static void main(String[] args) 
	{

Delta i = new Delta(100,"narenda");
System.out.println(i.number);
System.out.println(i.cname);
i.Deposit1();
i.withdrawl1();
		

	}

}
