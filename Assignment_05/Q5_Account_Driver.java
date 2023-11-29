//Write a program that creates a class Account that have members customer name, account number. Account has constructor to initialize 
//its members and method display() to show the result. Create a child class Savings_Account that is derived from Account class.
//Savings_Account have members min_bal and saving_bal. Use show() to display its details. Then create another child class Account_details
//from Savings_Account class have members deposit, withdrawl and a method show1() to show its details. 
//Child classes have constructors of their own. Create a driver class that creates a record of customer and display all its details.

class Account{
	String name;
	int acc_no;
	
	Account(String name, int acc_no){
		this.name = name;
		this.acc_no = acc_no;
	}
	void display(){
		System.out.print("Name: "+name);
		System.out.print("Account No.: "+acc_no);
	}
}

class Savings_Account extends Account{
	int min_bal;
	int saving_bal;
	
	Savings_Account(String name, int acc_no, int min_bal, int saving_bal){
		super(name,acc_no);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
	}
	
	void show(){
		System.out.print("Name: "+name);
		System.out.print("Account No.: "+acc_no);
		System.out.print("Minimum Balance: "+min_bal);
		System.out.print("Saving Balance: "+saving_bal);
	}
}

class Account_details extends Savings_Account{
	int deposit;
	int withdrawl;
	
	Account_details(String name, int acc_no, int min_bal, int saving_bal,int deposit,int withdrawl){
		super(name,acc_no,min_bal,saving_bal);
		this.deposit = deposit;
		this.withdrawl = withdrawl;
	}
	
	void show1(){
		System.out.println("Name: "+name);
		System.out.println("Account No.: "+acc_no);
		System.out.println("Minimum Balance: $"+min_bal);
		System.out.println("Saving Balance: $"+saving_bal);
		System.out.println("Deposit: $"+deposit);
		System.out.println("Withdrawl: $"+withdrawl);
	}
}

class Q5_Account_Driver{
	public static void main(String args[]){
		Account_details x = new Account_details("Kironmay Mishra",123872,30000000,20000,10000,5000);
		x.show1();
	}
}