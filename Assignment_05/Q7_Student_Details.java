// Create a class Student having data members name, roll and address. Note that address is an object of inner class Address having data members
// city and pin. Create some student class objects. Read, store (using constructor) and display their information. While creating the objects 
// your program should display a message Creating student number n from the constructor. You can get the value of n by using a static member of 
// Student class which is initialized to 0.

import java.util.*;
import java.util.*;

class Student {
    String name;
    int roll;
    private Address address;
    static int studentCount = 0;

    Student(String name, int roll, String city, int pincode) {
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pincode);
    }

    void display() {
		studentCount++;
		System.out.println("Creating student number " + studentCount);
        System.out.println("Student Information:"+studentCount);
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Address - City: " + address.city);
        System.out.println("Address - Pincode: " + address.pincode);
        System.out.println();
    }
}

class Address {
    String city;
    int pincode;

    Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }
}

class Q7_Student_Details{  
	public static void main(String[] args) {
        
        Student student1 = new Student("Kevin", 17, "New Jersey", 121);
        Student student2 = new Student("Reacher", 24, "Wellington", 230);
		Student student3 = new Student("Pirlo", 31, "Yorkshire", 314);


        student1.display();
        student2.display();
		student3.display();
    }
}




