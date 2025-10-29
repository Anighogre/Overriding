package com.ani.lab_5_sep_shopping_mall_application;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("		 1) General Customer");
		System.out.println("		 2) Prime Customer");
		System.out.println("		 3) VIP Customer");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Customer type :");
		int type = Integer.parseInt(sc.nextLine());
		
		System.out.print("Please Enter your Name :");
		String name = sc.nextLine();
		
		if(name==null || name.trim().isEmpty() || name.equals("null"))
		{
			System.err.println("Customer name cannot be empty or null.");
			System.exit(0);
		}
		
		System.out.print("Enter number of Items :");
		int n = Integer.parseInt(sc.nextLine());
		
		
		
		double arr[]  = new double[n];
		System.out.println("Please Enter the Item Name and Price :");
		
		double price = 0.0;
		
		for(int i=0; i<n; i++)
		{
			System.out.print((i+1)+")Item Name :");
			String itemName = sc.nextLine();
			
			System.out.print("Item Price :");
			price =  Double.parseDouble(sc.nextLine());
			
			arr[i] = price;
		}
			
		Customer cust = null;
		
		switch(type) {
		case 1 -> {
			cust = new GeneralCustomer(name);
			generateBill(cust, arr);
				
			}
		case 2 -> {
			cust = new PrimeCustomer(name);
			generateBill(cust, arr);
		}
		case 3 -> {
			cust = new VIPCustomer(name);
			generateBill(cust, arr);
		}
		}

	}

	public static void generateBill(Customer cust, double ...prices)
	{
//		GeneralCustomer g1 = (GeneralCustomer)cust; 
		System.out.println("Welcome to Hyderabad Mall  :");
		cust.calculateBill(prices);
		
	}
}
