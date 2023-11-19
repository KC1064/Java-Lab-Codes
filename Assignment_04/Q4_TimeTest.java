//Design a class ‘Time’ having data members as hour, minute and second. 
//The class should have a parameterized constructor to initialize its data members. 
//It should also have methods displayTime() to display the time in HH:MM:SS format and addTime()
// to add two times. Test these methods by creating a main method in another class.

import java.util.*;

class Time{
	int hour;
	int minute;
	int second;
	
	Time(int h, int m, int s){
		hour=h;
		minute=m;
		second=s;
	}
	
	Time addTime(Time x, Time y){
		Time z = new Time(0,0,0);
		z.hour = x.hour + y.hour;
		z.minute = x.minute + y.minute;
		z.second = x.second + y.second;
		return z;
	}
	void displayTime(){
		System.out.println();
		System.out.print(hour + ":" + minute + ":" + second);
	}
}

class Q4_TimeTest{
	public static void main(String args[]){
		Time t = new Time(12,34,51);
		Time u = new Time(2,4,14);
		Time a = t.addTime(t,u);
		if(a.second>59){
			a.minute++;
			a.second = a.second-60;
		}
		if(a.minute>59){
			a.hour++;
			a.minute=a.minute-60;
		}
		a.displayTime();
	}
}