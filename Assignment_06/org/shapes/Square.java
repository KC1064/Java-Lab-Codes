// Create a sub-package named shapes under a package org. Create some classes in the package representing some common geometric shapes like Square,
// Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. 
// Use this package to find area and perimeter of different shapes as chosen by the user.

package org.shapes;

public class Square{
	double side;
	
	public Square(double side){
		this.side = side;
	}
	
	public double area(){
		return side*side;
	}
	
	public double perimeter(){
		return 4*side;
	}
	
}