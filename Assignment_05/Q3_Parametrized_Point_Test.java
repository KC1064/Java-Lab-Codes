//Update the Q2 with default and parameterised constructor. Make changes as necessary. 
//Test the functionalities of above methods in the driver class.

import java.util.*;

class Point2D {
    int x, y;

    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.printf("(%d,%d)", x, y);
    }
}

class Point3D extends Point2D {
    int z;

    Point3D() {
        super(); 
        this.z = 0;
    }
	
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void show() {
        System.out.printf("(x,y,z)=(%d,%d,%d)", x, y, z);
    }
}

class Q3_Parametrized_Point_Test {
    public static void main(String args[]) {
        Point3D Point = new Point3D(10, 20, 30);
        System.out.print("Given Point: ");
        Point.show();
        System.out.println();
    }
}
