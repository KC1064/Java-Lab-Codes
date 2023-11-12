//Write a program to input an array and display the elements that are prime are composite.
import java.util.*;

class Q23_Prime_Composite {
	static int prime(int num){
		int temp=0;
		for (int i=2;i<=num/2; i++){
			if (num%i==0){
				temp=1;
				break;
			}
		}
		return temp;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter Value: ");
            arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int temp=prime(arr[i]);
			if(temp==1){
				System.out.println(arr[i]+ " is Composite.");
			}
			else{
				System.out.println(arr[i]+ " is Prime.");
			}
		}
	}
}