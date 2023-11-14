//Write a program to input an matrix and display its transpose.
import java.util.*;

class Q26_Transpose_of_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        int transpose_matrix[][] = new int[col][row];


        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Original Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        
        for (int a = 0; a < col; a++) {
            for (int b = 0; b < row; b++) {
                transpose_matrix[a][b] = matrix[b][a];
            }
        }
		
        System.out.println("Transposed Matrix:");
        for (int a = 0; a < col; a++) {
            for (int b = 0; b < row; b++) {
                System.out.printf("%d ", transpose_matrix[a][b]);
            }
            System.out.println();
        }
    }
}
