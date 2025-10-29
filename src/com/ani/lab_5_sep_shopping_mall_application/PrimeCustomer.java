package com.ani.lab_5_sep_shopping_mall_application;

public class PrimeCustomer extends Customer 
{
	protected double discountRate = 0.10;

	public PrimeCustomer(String name) {
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
			totl = totl+price;
		}
		
		
		double disc = totl * this.discountRate;
		System.out.println("Customer: "+this.name);
		System.out.println("Total cost RS :"+totl);
		System.out.println("Discount RS :"+disc);
		System.out.println("Final amount RS :"+(totl-disc));
		
	}
	
	
}
