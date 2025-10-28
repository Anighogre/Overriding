package com.ani.lab_4_sep_overriding_PaymentPprocess;

public class CreditCardPayment extends Payment 
{
	public void processPayment()
	{
		System.out.println("processing CreditCard payment....");
	}
}
