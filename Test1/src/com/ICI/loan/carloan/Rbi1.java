package com.ICI.loan.carloan;

public interface Rbi1
{

	public void withdrawl1();
	public void Deposit1();
		
	public static void main(String[] args) {
		
		Rbi1 i;
		
		i = new ICICI1();
		i.Deposit1();
		i.withdrawl1();

		i = new Hdfc1();
		i.Deposit1();
		i.withdrawl1();
		
	}
}
	
	

