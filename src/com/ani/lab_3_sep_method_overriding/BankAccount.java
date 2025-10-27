package com.ani.lab_3_sep_method_overriding;

public class BankAccount 
{
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE = "SBIHYD1001";
	
	public BankAccount(String accountHolderName,String accountNumber, double balance) 
	{
		super();
		if(accountHolderName == null || accountHolderName.trim().isEmpty() || accountHolderName.equals("null"))
		{
			System.err.println("Account holder name cannot be empty.");
			System.exit(0);
		}
		
		if(accountNumber.trim().isEmpty())
		{
			System.err.println("Account number cannot be empty.");
			System.exit(0);
		}
		
		if(balance <0)
		{
			System.err.println("Balance cannot be negative.");
			System.exit(0);
		}
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void calculateInterest()
	{
		System.out.println("SBI provide 0.9% interesr rate");
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account Holder: "+this.accountHolderName);
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Balance RS :"+this.balance);
		System.out.println("IFSC CODE :"+this.IFSC_CODE);
	}
	
	
	
}
