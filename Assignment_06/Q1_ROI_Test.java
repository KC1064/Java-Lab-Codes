//Create a abstract class Bank that has abstract method getROI(). Create two classes SBI, PNB, BOI inherited from Bank. 
//Create a driver class that prints the rate of interest of each bank using super class memory reference. 
import java.util.*;

abstract class Bank{
	abstract void getROI();
}

class SBI extends Bank{
	public void getROI(){
		System.out.println("Rate of Interest of SBI: 8%");
	}
}
class BOI extends Bank{
	public void getROI(){
		System.out.println("Rate of Interest of BOI: 7%");
	}
}
class PNB extends Bank{
	public void getROI(){
		System.out.println("Rate of Interest of PNB: 9%");
	}
}

class Q1_ROI_Test{
	public static void main(String args[]){
		Bank x = new SBI();
		x.getROI();
		Bank y = new BOI();
		y.getROI();
		Bank z = new PNB();
		z.getROI();
	}
}
