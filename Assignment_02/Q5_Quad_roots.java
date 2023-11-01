//Write a program to calculate the roots of a quadratic equation.
import java.util.*;
import java.lang.Math;

class Q5_Quad_roots {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficients: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float d = (b*b)-4*a*c;
		
		if (d>0){
			System.out.println("The roots are real and distinct.");
			float root1= (float)(-b +Math.sqrt((b*b)-4*a*c)/2*a);
			float root2= (float)(-b +Math.sqrt((b*b)-4*a*c)/2*a);
			System.out.println("The roots are :"+ root1 + " and " + root2);
		}
		else if (d==0){
			System.out.println("The roots are real and Equal.");
			float root = (-b/2*a);
			System.out.println("The roots are" + root);
		}
		else {
			System.out.println("The roots are imaginary.");
			System.out.println("The roots are :" + (-b/2*a) + "+ i"+(Math.sqrt(d)/2*a) +" and "+ (-b/2*a) + "+ i"+ (Math.sqrt(d)/2*a));
		}
	}
}