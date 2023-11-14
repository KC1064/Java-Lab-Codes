// Write a program to add two matrix.

import java.util.*;

class Q25_Matrix_addition{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int col = sc.nextInt();

        int matrixA[][] = new int[row][col];
        int matrixB[][] = new int[col][row];
		int sum[][] = new int[row][col];
		System.out.println("Enter the elements of the 1st matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
		System.out.println("Enter the elements of 2nd matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
		System.out.println("Sum of the two matrice's: ");
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ",sum[i][j]);
            }
			System.out.println();
        }
	}
} 