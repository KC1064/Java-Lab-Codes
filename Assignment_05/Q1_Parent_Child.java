//Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, 
//create an object for each of the class and call
//a) method of parent class by object of parent class
//b) method of child class by object of child class
//c) method of parent class by object of child class

import java.util.*;

class Parent{
	void display(){
		System.out.println("This is parent class.");
	}
}

class Child extends Parent{
	void show(){
		System.out.println("This is child class.");
	}
}

class Q1_Parent_Child{
	public static void main(String args[]){
		System.out.println("Called Method of parent class by object of parent class");
		Parent pa = new Parent();
		pa.display();
		System.out.println("Called Method of child class by object of child class");
		Child ch = new Child();
		ch.show();
		System.out.println("Called Method of parent class by object of child class");
		Child ob = new Child();
		ob.display();
	}
}