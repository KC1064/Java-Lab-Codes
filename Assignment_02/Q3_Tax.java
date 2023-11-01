//Write a program to calculate tax, given the following conditions:
//                If income is less than 150000 then no tax
//                If taxable income is in the range 150001 to 300000 then charge 10% tax
//                If taxable income is in the range 300001 to 500000 then charge 20% tax
//                If taxable income is above 500001 then charge 30% tax

import java.util.*;

class Q3_Tax {
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the income amount: ");
		int income = sc.nextInt();
		
		if (income <=150000){
			System.out.print("No tax to be paid");
		}
		else if (income >= 150001 && income <= 300000){
			System.out.print("Amount of tax to be paid : "+ 0.1f*income);
		}
		else if (income >= 300001 && income <= 500000) {
			System.out.print("Amount of tax to be paid : "+ 0.2f*income);
		}
		else {
			System.out.print("Amount of tax to be paid : "+ 0.3f*income);
		}
	}
}
