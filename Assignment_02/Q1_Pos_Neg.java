//Write a program to check whether an inputted number is positive or negative.
import java.util.*;

class Q1_Pos_Neg {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		if (num>=0){
			System.out.printf("%d : Positive Number",num);
		}
		else {
			System.out.printf("%d : Negative Number",num);
		}
	}
	
}