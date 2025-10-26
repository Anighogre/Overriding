package com.ani.overriding;

class Vehicle
{
	public int tanckCapacity()
	{
		return 80;
	}
	
	public void printTankCapacity()
	{
		System.out.println(this.tanckCapacity());
	}
}

class Car extends Vehicle
{
	@Override
	public int tanckCapacity()
	{
		return 42;
	}
	
	public void printTankCapacity()
	{
		System.out.println(super.tanckCapacity());
	}
}

public class IQ_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Car();
		v1.printTankCapacity();
	}

}
