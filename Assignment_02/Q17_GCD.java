//WAP to input two integers and find there GCD
import java.util.*;

class Q17_GCD {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the Second number: ");
		int num2=sc.nextInt();
		int min=0;
		if(num1>=num2){
			min=num1;
		}
		else{
			min=num2;
		}
		int max=0;
		for(int i=1;i<min;i++){
			if(num1%i==0 && num2%i==0){
				 max=i;
			}
		}
		System.out.print("GCD: "+ max);		
	}
	
}