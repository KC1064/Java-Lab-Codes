//Create a class Person that has data member name. Use constructor to initialize name and display() to display name. Create a derived 
//class Employee from Person class having private members empid. Using constructor initialize empid and have method display() to display 
//empid. Create another derived class HourlyEmployee from Employee with private members hourlyRate and hoursWorked.
//Use constructor to initialize input and methods getGrossPay() that computes and returns the gross pay of the employee and display() 
//to display the hourlyRate, hoursWorked and gross pay. Create a driver class to test the functionalities of the above classes and display 
//output in the following format
//Name : John Smith
//EmpID : 7569
//Hourly Rate : 100
//Hours worked : 2000
//Gross pay : 200000 

import java.util.*;

class Person {
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	void display(){
		System.out.println("Name: "+name);
	}
}

class Employee extends Person{
	private int empid;
	
	Employee(String name, int empid){
		super(name);
		this.empid = empid;
	}
	void display(){
		System.out.println("Name: "+name);
		System.out.println("EmpID "+empid);
	}
}

class HourlyEmployee extends Employee{
	private int hourlyRate;
	private int hoursWorked;
	
	HourlyEmployee(String name, int empid,int hourlyRate, int hoursWorked){
		super(name,empid);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;		
	}
	
	int getGrossPay(){
		return (hourlyRate*hoursWorked);
	}
	
	void display(){
		super.display();
		System.out.println("Hourly Rate: "+hourlyRate);
		System.out.println("Hours Worked "+hoursWorked);
		System.out.println("Gross Pay: "+ getGrossPay());
	}
}

class Q6_Employee_Salary{
	public static void main(String args[]){
		HourlyEmployee x = new HourlyEmployee("John Smith",7569,100,200);
		x.display();
	}
}