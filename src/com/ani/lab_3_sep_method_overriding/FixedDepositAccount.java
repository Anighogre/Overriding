package com.ani.lab_3_sep_method_overriding;

public class FixedDepositAccount extends BankAccount 
{
	protected double interestRate = 0.065;
	protected int depositTerm;
	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance,
			int depositTerm) {
		super(accountHolderName, accountNumber, balance);
		
		if(depositTerm<0)
		{
			System.err.println("depositTerm can't be negative.");
			System.exit(0);
		}
		this.depositTerm = depositTerm;
	}
	
	public void calculateInterest()
	{
		double interest = (this.balance*this.depositTerm)*0.065;
		System.out.println("Fixed Deposit Interest for "+this.depositTerm+" years RS :"+interest);
	}
	
	
}
