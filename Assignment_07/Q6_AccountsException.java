// Write a class called Account with the following properties and methods:
// Properties: String name, int acc_no, double balance
//       	Methods:  void deposit (double amt)
//  void withdraw (double amt), 
//  void transfer (Account acc1, Account acc2, double amt)
// Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw or transfer, which results in balance 
// going below 500, throw a user defined exception called MinimumBalanceException. Use throw and throws wherever necessary.

// Write a class called Account with the following properties and methods:
// Properties: String name, int acc_no, double balance
//       	Methods:  void deposit (double amt)
//  void withdraw (double amt), 
//  void transfer (Account acc1, Account acc2, double amt)
// Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw or transfer, which results in balance 
// going below 500, throw a user defined exception called MinimumBalanceException. Use throw and throws wherever necessary.
import java.util.*;

class Account {
    String name;
    int acc_no;
    double balance;

    Account(String name, int acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void withdraw(double amt) throws MinimumBalanceException {
        if (this.balance - amt < 500) {
            throw new MinimumBalanceException();
        } else {
            this.balance = this.balance - amt;
            System.out.println("Withdrawal successful. Current Balance: " + this.balance);
        }
    }

    void transfer(Account acc2, double amt) throws MinimumBalanceException {
        if (this.balance - amt < 500) {
            throw new MinimumBalanceException();
        } else {
            this.balance = this.balance - amt;
            acc2.balance = acc2.balance + amt;
            System.out.println("Transfer successful.");
            System.out.println("Current Balance for " + this.name + ": " + this.balance);
            System.out.println("Current Balance for " + acc2.name + ": " + acc2.balance);
        }
    }
}

class MinimumBalanceException extends Exception {
    MinimumBalanceException() {
        super("Balance below 500");
    }
}

class Q6_AccountsException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        int acc_no = sc.nextInt();
        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account x = new Account(name, acc_no, initialBalance);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Transfer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        x.withdraw(withdrawAmount);
                    } catch (MinimumBalanceException e) {
                        System.out.println("Withdrawal failed. " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount to transfer: ");
                    double transferAmount = sc.nextDouble();
                    System.out.print("Enter the recipient's account details:\nName: ");
                    String recipientName = sc.next();
                    System.out.print("Account Number: ");
                    int recipientAccNo = sc.nextInt();

                    Account recipient = new Account(recipientName, recipientAccNo, 0); // Initialize recipient with zero balance
                    try {
                        x.transfer(recipient, transferAmount);
                    } catch (MinimumBalanceException e) {
                        System.out.println("Transfer failed. " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting.....");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
