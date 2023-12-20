// Define an interface Calculator which has the basic methods add(), sub( ), mul() and div(). Define a concrete class named as 
// DemoCalculator that implements the interface. Define the driver class, which create object reference of the interface Calculator 
// and perform all basic operation of the calculator.

import java.util.*;

interface calculator{
	void add();
	void sub();
	void mul();
	void div();
}

class DemoCalculator{
	int a,b;
	
	public void add(){
		System.out.println("Sum: "+(a+b));
	}
	public void sub(){
		System.out.println("Sub: "+(a-b));
	}
	public void mul(){
		System.out.println("Product: "+(a*b));
	}
	public void div(){
		System.out.println("Division: "+(a/b));
	}	
}

class Q2_Calculator_Test{
	public static void main(String args[]){
		DemoCalculator x = new DemoCalculator();
		x.a=10;
		x.b=5;
		x.add();
		x.mul();
		x.sub();
		x.div();
	}
}
