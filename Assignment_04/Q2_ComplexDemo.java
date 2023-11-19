//Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img. 
//The class should have a parameterized constructor to initialize its data members. 
//It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for
// example), addCompNumber() to add two Complex numbers. 
//Test these methods by creating main method in another class.

import java.util.*;

class ComplexNum {
	int real,img;
	ComplexNum(int x,int y){
		real=x;
		img=y;
	}
	
	ComplexNum addCompNumber(ComplexNum a, ComplexNum b){
		ComplexNum result = new ComplexNum(0,0);
		result.real= a.real + b.real;
		result.img = a.img + b.img;
		return result;
	}
	void displayCompNumber(){
		System.out.println("Sum: "+ real + "+" + img + "i");
	}
}

class Q2_ComplexDemo{
	public static void main(String args[]){
		ComplexNum x = new ComplexNum(5,7);
		ComplexNum y = new ComplexNum(4,6);
		ComplexNum z = x.addCompNumber(x,y);
		z.displayCompNumber();
	}
}