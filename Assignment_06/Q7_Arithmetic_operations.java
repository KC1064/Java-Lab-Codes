// Create a sub-package called arithmetic under the package btech. The arithmetic package should contain a class MyMath having methods to deal with different 
// arithmetic operations (addition, subtraction, multiplication, division and mod). Create a class Test containing the main method which will use the 
// methods of sub-package arithmetic.
import btech.arithmetic.MyMath;
import java.util.*;

class Q7_Arithmetic_operations{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double m = sc.nextInt();
		double n = sc.nextInt();
		MyMath obj = new MyMath(m,n);
		System.out.println("Add: "+obj.add(m,n));
		System.out.println("Sub: "+obj.sub(m,n));
		System.out.println("Div: "+obj.div(m,n));
		System.out.println("Mul: "+obj.mul(m,n));
		System.out.println("Mod: "+obj.mod(m,n));
	}
}