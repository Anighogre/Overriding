package com.ani.lab_5_sep_shopping_mall_application;

public class GeneralCustomer extends Customer 
{

	public GeneralCustomer(String name) 
	{
		super(name);
	}
	
	@Override
	public void calculateBill(double ...prices)
	{
		double totl = 0;
		
		for(double price : prices)
		{
			if(price <0)
			{
				System.err.println("Item price cannot be negative.");
				System.exit(0);
			}
			totl = totl + price;
		}
		
	
		
		
		System.out.println("Customer: "+name);
		System.out.println("Total cost RS : "+totl);
		System.out.println("Discount: No discount for general customers.");
	}
	
}
