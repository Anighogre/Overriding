package com.ani.lab_2_sep_method_ovveriding;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime Employees");
		System.out.println("2) PartTime Employees ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please select the Employee type :");
		int type = Integer.parseInt(sc.nextLine());
		
		
		
		if(type==1)
		{
			System.out.print("Enter Fulltime Employee Id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Fulltime Employee Name :");
			String name = sc.nextLine();
			
			System.out.print("Enter the Salary :");
			double salary = Double.parseDouble(sc.nextLine());
			
			Employee fulltimeEmp = new FullTimeEmployee(id, name, salary);
			double totalSal = fulltimeEmp.calculateSalary();
			System.out.println(name+" Salary is :"+totalSal);
		} 
		else if(type ==2)
		{
			System.out.print("Enter PartTime Employee Id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter PartTime Employee Name :");
			String name = sc.nextLine();
			
			System.out.print("Enter your hourly rate:");
			double hourlyRate = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter your total works hour in the month :");
			int totlWorksHour = Integer.parseInt(sc.nextLine());
			
			Employee partTimeEmp = new PartTimeEmployee(id, name, hourlyRate, totlWorksHour);
			double totalSal = partTimeEmp.calculateSalary();
			System.out.println(name+" Salary is :"+totalSal);	
		}else {
			System.err.println("please select correct Type of Employee");
			System.exit(0);
		}
		sc.close();

	}

}
