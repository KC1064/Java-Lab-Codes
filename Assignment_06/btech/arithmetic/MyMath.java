// Create a sub-package called arithmetic under the package btech. The arithmetic package should contain a class MyMath having methods to deal with different 
// arithmetic operations (addition, subtraction, multiplication, division and mod). Create a class Test containing the main method which will use the 
// methods of sub-package arithmetic.

package btech.arithmetic;

public class MyMath{
	public double num1;
	public double num2;
	
	public MyMath(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add(double num1,double num2){
		return num1+num2;
	}
	
	public double sub(double num1,double num2){
		return num1-num2;
	}
	public double div(double num1,double num2){
		return num1/num2;
	}
	public double mul(double num1,double num2){
		return num1*num2;
	}
	public double mod(double num1,double num2){
		return num1%num2;
	}
	
}


