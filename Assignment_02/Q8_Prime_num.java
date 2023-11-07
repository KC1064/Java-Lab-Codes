//Write a program to check whether an inputted number is prime or not.
import java.util.*;

class Q8_Prime_num {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp=0;
		for (int i=2;i<=num/2; i++){
			if (num%i==0){
				temp=1;
				break;
			}
		}
		if(temp==0){
			System.out.printf("%d is a prime number.",num);
		}
		else{
			System.out.printf("%d is not a prime number.",num);
		}
	}
}