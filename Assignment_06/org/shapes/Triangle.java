// Create a sub-package named shapes under a package org. Create some classes in the package representing some common geometric shapes like Square,
// Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. 
// Use this package to find area and perimeter of different shapes as chosen by the user.

package org.shapes;

public class Triangle{
	double base;
	double side1;
	double side2;
	double height;
	
	public Triangle(double base, double side2,double side1,double height){
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double area(){
		return 0.5f*base*height;
	}
	
	public double perimeter(){
		return (base+side1+side2);
	}
	
}