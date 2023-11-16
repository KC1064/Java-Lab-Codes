//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
//by creating a class named 'Rectangle' with a method named 'Area ()' which returns the area.

class Rectangle{
	int length,breadth;
	void assign(int l,int b){
		length=l;
		breadth=b;
	}
	void Area(){
		int area= length*breadth;
		System.out.println("Area: "+ area);
	}
}

class Q3_RectDemo{
	public static void main(String args[]){
		Rectangle x = new Rectangle();
		x.assign(4,5);
		x.Area();
		//Rectangle y = new Rectangle();
		x.assign(5,8);
		x.Area();
	}
}
