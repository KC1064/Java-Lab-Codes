//Define a class ‘Box’ that uses a parameterized constructor to initialize the dimensions of a box. 
//The dimensions of the Box are width, height, depth. The class should have a method that can return 
//the volume of the box. Create an object of the Box class and test the functionalities

import java.util.*;

class Box{
	int height,depth,width;
	
	Box(int a,int b,int c){
		height=a;
		depth=b;
		width=c;
	}
	void volume(){
		System.out.println("Volume: "+ height*width*depth);
	}
}

class Q1_BoxDemo1{
	public static void main(String args[]){
		Box x = new Box(12,20,10);
		x.volume();
	}
}