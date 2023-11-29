//Create a derived class Circle inherited from the class Point2D (created in Q2) with the data member radius and method area() 
//that returns the area of circle. Create a subclass called Cylinder which is derived from the superclass Circle having data member 
//height and volume() that computes the volume of cylinder. Use constructor to initialize the instance variables. 
//Test the methods of Circle and Cylinder classes by creating objects in the main method of another class.
import java.util.*;

class Point2D {
    double radius;

    double area() {
        double area = 3.14f * radius * radius;
        System.out.println("Area: " + area);
        return area;
    }
}

class Circle extends Point2D {
    Circle(double radius) {
        this.radius = radius;
    }
}

class Cylinder extends Circle {
    double height;
	
    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    void volume() {
        double vol = super.area() * height;
        System.out.println("Volume of Cylinder: " + vol);
    }
}

class Q4_Area_Volume {
    public static void main(String args[]) {
        Cylinder x = new Cylinder(100, 20);
        x.area();
        x.volume();
    }
}
