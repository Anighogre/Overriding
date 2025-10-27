package com.ani.lab_3_sep_method_overriding;

import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		System.out.println("Please select the Account Type :");
		System.out.println("        1) Saving Account");
		System.out.println("        2) Current Account");
		System.out.println("        3) Fixed Deposit Account");
		System.out.println("Please enter the type of account you want to open : [1/2/3]");
		
		Scanner sc = new Scanner(System.in);
		int type = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter account Holder Name :");
		String name = sc.nextLine();
		
		System.out.print("Enter account Number :");
		String aNo = sc.nextLine();
		
		System.out.print("Enter the Amount :");
		double amount = Double.parseDouble(sc.nextLine());
		
		
		switch(type) {
		
		case 1 -> {
			
			BankAccount saving = new SavingsAccount(name, aNo, amount);
			saving.displayAccountDetails();
			saving.calculateInterest();
		}
		
		case 2 -> {
			BankAccount current = new CurrentAccount(name, aNo, amount);
			current.displayAccountDetails();
			current.calculateInterest();
			
			CurrentAccount c1 = (CurrentAccount) current; 
			c1.checkOverdraftLimit();
		}
		
		case 3-> {
			System.out.print("Enter the deposit term [For How many years you want to deposit] :");
			int dTerm = Integer.parseInt(sc.nextLine());
			
			BankAccount fixed = new FixedDepositAccount(name, aNo, amount, dTerm);
			fixed.displayAccountDetails();
			fixed.calculateInterest();
		}
		}
		
		
		
	}	
}
