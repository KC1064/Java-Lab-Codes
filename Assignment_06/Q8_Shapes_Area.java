// Create a sub-package named shapes under a package org. Create some classes in the package representing some common geometric shapes like Square,
// Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. 
// Use this package to find area and perimeter of different shapes as chosen by the user.

import org.shapes.*;
import java.util.*;


class Q8_Shapes_Area{
	public static void main(String args[]){
		Square ob1 = new Square(20);
		Circle ob2 = new Circle(100);
		Triangle ob3 = new Triangle(14,16,18,20);
		System.out.println("SQUARE: ");
		System.out.println("Area: "+ob1.area());
		System.out.println("Perimeter: "+ ob1.perimeter());
		System.out.println("CIRCLE: ");
		System.out.println("Area: "+ob2.area());
		System.out.println("Perimeter: "+ ob2.perimeter());
		System.out.println("TRIANGLE: ");
		System.out.println("Area: "+ob3.area());
		System.out.println("Perimeter: "+ ob3.perimeter());
	}
	
}
