//Write an exception handling java program to read two numbers n1, n2 and calculate and print the result of n1/n2. If n2 is Zero (0) then it will 
//be handled by exception handler and again ask the value of n2. In the exception handler the program should display appropriate message to the 
//user.
import java.util.*;
class Q1_DivideByZero {
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n1 and n2: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		try{
			
			System.out.println("result"+num1/num2);
		}
		catch (ArithmeticException e){
			System.out.println("Division by Zero not possible.");
			System.out.println("Enter a valid number: ");
			num2 = sc.nextInt();
			//double result = num1/num2;
			System.out.println("result: "+num1/num2);
		}ṇ
	}
}


//Alternate approach

// ` if(num2==0){
//	throws new ArithmeticException
//	else
}
`