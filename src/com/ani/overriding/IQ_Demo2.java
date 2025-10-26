package com.ani.overriding;

class Bird
{
	public void roam()
	{
		System.out.println("Generic bird is roaming");
	}
	
	public void fly()
	{
		System.out.println("Generic bird is flying");
	}
}

class Parrot extends Bird
{
	@Override
	public void roam()
	{
		System.out.println("Parrot bird is roaming");
	}
	
	public int fly(int height)
	{
		System.out.println("Parrot bird if flying");
		return 0;
	}
}

public class IQ_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot p1 = new Parrot();
		p1.roam();
		p1.fly(15);
	}

}
