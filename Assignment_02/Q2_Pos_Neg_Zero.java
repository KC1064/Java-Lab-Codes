//Write a program to test whether a number is positive, negative or equal to zero.import java.util.*;
import java.util.*;

class Q2_Pos_Neg_Zero {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		if (num>0){
			System.out.printf("%d : Positive Number",num);
		}
		else if (num==0){
			System.out.printf("Number is Zero");
		}
		else {
			System.out.printf("%d : Negative Number",num);
		}
	}
	
}