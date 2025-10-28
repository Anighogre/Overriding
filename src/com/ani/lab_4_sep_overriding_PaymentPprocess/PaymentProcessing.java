package com.ani.lab_4_sep_overriding_PaymentPprocess;

public class PaymentProcessing 
{

	public static void main(String[] args) 
	{
		PaymentProcessing p = new PaymentProcessing();
		
		 p.paymentGateway(new CreditCardPayment(), new DebitCardPayment(), new UPIPayment());
	}
	
	
	public void paymentGateway(Payment ...payments)
	{
		for(Payment p : payments)
		{
			if(p instanceof CreditCardPayment card)
			{
				card.processPayment();
			}
			
			if(p instanceof DebitCardPayment card)
			{
				card.processPayment();
			}
			
			if(p instanceof UPIPayment upi)
			{
				upi.processPayment();
			}
		}
	}

}
