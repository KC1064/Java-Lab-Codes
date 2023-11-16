//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim ()' takes length and breadth of rectangle as parameters and the second method 
//named as 'getArea ()' returns the area of the rectangle. Length and breadth of rectangle are entered 
//through keyboard. 

import java.util.*;
class Area{
	int length,breadth;
	void setDim(int l,int b){
		length=l;
		breadth=b;
	}
	int getArea(){
		int area= length*breadth;
		return area;
	}
}

class Q6_DriverDemo{
	public static void main(String args[]){
		Area x = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and Breadth: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		x.setDim(l,b);
		int z = x.getArea();		
		System.out.print("Area: "+z);
	}
}