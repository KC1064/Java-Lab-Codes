//Write a program to enter a number from 1 to 7 and display the corresponding day of the week Using switch statement.
import java.util.*;

class Q6_Week {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= sc.nextInt();
		switch(num){
			case 1:
			System.out.print("Monday");
			break;
			case 2:
			System.out.print("Tuesday");
			break;
			case 3:
			System.out.print("Wednesday");
			break;
			case 4:
			System.out.print("Thursday");
			break;
			case 5:
			System.out.print("Friday");
			break;
			case 6:
			System.out.print("Saturday");
			break;
			case 7:
			System.out.print("Sunday");
			break;
			default:
			System.out.print("Invalid Input");
		}
	}
}