//Design a class ‘Point’ with data members as xCo and yCo. The class should have a parameterized constructor 
//to initialize its data members. 
//Define a method distanceBetPoints() which returns the distance between two points.

import java.util.*;

class Point{
	int x,y;
	
	Point(int x_co, int y_co){
		x=x_co;
		y=y_co;
	}
	
	Point distanceBetPoints(Point a, Point b){
		Point q = new Point(0,0);
		q.x = (a.x-b.x);
		q.y = (a.y-b.y);
		return q;
	}
	void display(){
		double result= Math.pow(x,2) + Math.pow(y,2);
		double distance = Math.sqrt(result);
		System.out.println("Distance between the points: "+distance);
	}
}

class Q3_PointDemo{
	public static void main(String args[]){
		Point p = new Point(5,7);
		Point q = new Point(1,4);
		Point r = p.distanceBetPoints(p,q);
		r.display();
	}
}