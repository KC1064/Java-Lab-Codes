// Write an exception handling java program to print the index position of an existing integer array. The index value will be entered by user. 
// It will be handled by exception handler if index position is greater then the size of array. In the exception handler the program should display
// appropriate message to the user.

import java.util.*;

class Q3_IndexException{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {23,13,35,32,54,37,22,98};
		System.out.println("Enter the index value to search: ");
		int index = sc.nextInt();
		
		try{
			if(index>=arr.length){
				throw new ArrayIndexOutOfBoundsException();
			}
			else{
				System.out.println("Your searched Index is found.");
			}
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Not a valid index for array.");
		}
	}
} 