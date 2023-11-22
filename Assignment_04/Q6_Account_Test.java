//Create a class Account having data members accNo, balance, timePeriod and int InYears(as static and 
//initialize with 7.5%). The class should also contain the following methods:float calculateInterst() 
//which calculates and returns the interest amount.void showAccDetails() which displays account number,
//balance and calculated interest amount. static void changeIntRate(float newRate) which changes the 
//interest rate to newRate. Create an array of object of the class Account. Store the details of each 
//object through the parameterized constructor. Display all the account details by calling the method 
//showAccDetails(). Change the interest rate to a new one by calling the method changeIntRate(). 
//Finally display the account details after the change in interest rate.

import java.util.*;

class Account {
    double accNo;
    double balance;
    static int InYears = 5;
    static double rate = 7.5;

    float calculateInterst() {
        return (float) ((balance * InYears * rate) / 100);
    }

    void showAccDetails() {
        System.out.println("\nAccount No: " + accNo);
        System.out.println("Interest Amount: " + calculateInterst());
        System.out.println("Balance Amount: " + balance);
    }

    static void changeIntRate(double newRate) {
        rate = newRate;
    }
}

class Q6_Account_Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of members: ");
        int n = sc.nextInt();
        Account arr[] = new Account[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Account();
            System.out.println("\nAccount Details of Person " + (i + 1) + ":");
            System.out.print("Enter the Account No.: ");
            arr[i].accNo = sc.nextDouble();
            System.out.print("Enter the Balance amount: ");
            arr[i].balance = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            arr[i].showAccDetails();
        }

        Account.changeIntRate(12.5);

        for (int i = 0; i < n; i++) {
            arr[i].calculateInterst();
            arr[i].showAccDetails();
        }
    }
}
