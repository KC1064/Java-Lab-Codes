// Write a class called Account with the following properties and methods:
// Properties: String name, int acc_no, double balance
//       	Methods:  void deposit (double amt)
//                    void withdraw (double amt)
// Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw, which results in balance going below 500, 
// throw a user defined exception called MinimumBalanceException. Use throw and throws wherever necessary.
import java.util.Scanner;

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void deposit(double amt) {
        this.balance = this.balance + amt;
        System.out.println("Deposit successful. Current Balance: " + balance);
    }

    void withdraw(double amt) throws myException {
        if (this.balance - amt < 500) {
            throw new myException();
        } else {
            this.balance = this.balance - amt;
            System.out.println("Withdrawal successful. Current Balance: " + this.balance);
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + this.balance);
    }
}

class myException extends Exception {
    myException() {
        super("Not Sufficient Balance. Minimum balance should be 500.");
    }
}

class Q5_AccountDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        int acc_no = sc.nextInt();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(name, acc_no, balance);

        int choice;
        do {
            System.out.println("------------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Current Balance");
            System.out.println("4. Exit");
            System.out.println("------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (myException e) {
                        System.out.println("Withdrawal failed. ");
                    }
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Exiting.....");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}