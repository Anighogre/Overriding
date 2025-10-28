package com.ani.lab_4_sep_overriding_PaymentPprocess;

public class DebitCardPayment extends Payment 
{
	public void processPayment()
	{
		System.out.println("processing Debit Card payment....");
	}
}
