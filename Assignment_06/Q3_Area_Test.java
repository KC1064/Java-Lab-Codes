// Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 
// 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
// side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 
// 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' 
// and call all the three methods. 

import java.util.*;

abstract class Shape{
	abstract void RectangleArea(int l,int b);
	abstract void CircleArea(int r);
	abstract void SquareArea(int s);
}

class Area extends Shape{
	public void RectangleArea(int l,int b){
		System.out.println("Area of Rectangle: "+(l*b));
	}
	public void CircleArea(int r){
		System.out.println("Area of circle "+(3.14f*r*r));
	}
	public void SquareArea(int s){
		System.out.println("Area of Square: "+(s*s));
	}
}

class Q3_Area_Test{
	public static void main(String args[]){
		Area x = new Area();
		x.RectangleArea(20,10);
		x.CircleArea(10);
		x.SquareArea(20);
	}
}