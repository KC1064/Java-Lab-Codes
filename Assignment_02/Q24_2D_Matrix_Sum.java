//Write a program to input a 2d array and display the sum of the elements present in the array.
import java.util.*;

class Q24_2D_Matrix_Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter no. of columns: ");
		int col = sc.nextInt();
		int arr[][]= new int[row][col];
		for(int i=0; i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<row;i++){
			for(int j=0;j<col;j++){
				sum=sum+arr[i][j];
			}
		}
		System.out.print("Sum of all the elements: "+sum);
	}
}


