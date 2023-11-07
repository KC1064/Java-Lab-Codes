//Write a program to check whether an inputted number is palindrome or not.
import java.util.*;

class Q9_Palindrome_num {
	public static void main(String args[]) {
		int og_num;
		int rev_num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		og_num=num;
		while(num!=0){
			int rem = num % 10;
			rev_num = rev_num*10 + rem;
			num /= 10;
		}
		if(og_num == rev_num){
			System.out.print(og_num + " is Palindrome");
		}
		else {
			System.out.print(og_num + " is not a Palindrome");
		}
	}
}