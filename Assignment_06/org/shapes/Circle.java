// Create a sub-package named shapes under a package org. Create some classes in the package representing some common geometric shapes like Square,
// Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. 
// Use this package to find area and perimeter of different shapes as chosen by the user.

package org.shapes;

public class Circle{
	double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double area(){
		return 3.14f * radius * radius;
	}
	
	public double perimeter(){
		return 2*3.14f*radius;
	}
	
}