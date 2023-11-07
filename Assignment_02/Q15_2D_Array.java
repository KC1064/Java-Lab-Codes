//Write a program to enter elements into a 2-D array and then display them.
import java.util.*;

class Q15_2D_Array{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2D-Array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
			for(int j = 0; j<n;j++){
				System.out.print("Enter Value: ");
				arr[i][j] = sc.nextInt();
			}
        }
		System.out.println("2D-Array: \n");
		for (int i = 0; i < m; i++) {
			for(int j = 0; j<n;j++){
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
        }
	}
}