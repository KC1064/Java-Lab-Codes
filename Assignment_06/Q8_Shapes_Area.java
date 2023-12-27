// Create a sub-package named shapes under a package org. Create some classes in the package representing some common geometric shapes like Square,
// Triangle, Circle and so on. The classes should contain the area( ) and perimeter( ) methods in them. Compile the package. 
// Use this package to find area and perimeter of different shapes as chosen by the user.

import org.shapes.*;
import java.util.*;


class Q8_Shapes_Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("----------");
			System.out.println("1.Square");
			System.out.println("2.Circle");
			System.out.println("3.Triangle");
			System.out.println("4.Exit");
			System.out.println("----------");
			System.out.print("Choose the shape: ");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter the side: ");
					int side = sc.nextInt();
					Square ob1 = new Square(side);
					System.out.println("SQUARE: ");
					System.out.println("Area: "+ob1.area());
					System.out.println("Perimeter: "+ ob1.perimeter());
					break;
				case 2:
					System.out.println("Enter the radius: ");
					int radius = sc.nextInt();
					Circle ob2 = new Circle(radius);
					System.out.println("CIRCLE: ");
					System.out.println("Area: "+ob2.area());
					System.out.println("Perimeter: "+ ob2.perimeter());
					break;
				case 3:
					System.out.println("Enter the sides of triangle: ");
					int a = sc.nextInt();
					int b = sc.nextInt();
					int c = sc.nextInt();
					System.out.println("Enter the height of triangle: ");
					int ht = sc.nextInt();
					Triangle ob3 = new Triangle(a,b,c,ht);
					break;
				case 4:
				System.out.println("EXITING........");
				choice = 0;
				
			}
		}while(choice!=0);
	}
	
}
