//Create a class Point2D with the data member x and y coordinate and methods getCoord() that sets the coordinate value and display() 
//to show the coordinates. Create a subclass called Point3D which is derived from the superclass Point2D with data members z coordinate
//and has methods getInput() to initialize the input and show() method to display the coordinates. Test the methods of both the 
//classes by creating objects in the main method of driver class.

import java.util.*;

class Point2D {
	int x,y;
	
	void getCoord(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	void display(){
		System.out.printf("(%d,%d)",x,y);
	}
}

class Point3D extends Point2D {
	int z;
	
	void getinput(int a, int b, int c){
		x=a;
		y=b;
		z=c;
	}
	
	void show(){
		System.out.printf("(x,y,z)=(%d,%d,%d)",x,y,z);
	}
}

class Q2_Point_Test{
	public static void main(String args[]){
		Point3D x = new Point3D();
		x.getinput(10,20,30);
		x.show();
	}
}
