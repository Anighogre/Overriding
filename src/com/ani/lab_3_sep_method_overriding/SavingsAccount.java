package com.ani.lab_3_sep_method_overriding;

public class SavingsAccount extends BankAccount 
{
	protected double interestRate = 0.04;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) 
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	public void calculateInterest()
	{
		double interest = this.balance * this.interestRate;
		System.out.println("Savings Account Interest RS :"+interest);
	}
	
}
