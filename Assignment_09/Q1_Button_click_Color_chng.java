// Write a java program to creates three push buttons 
// showing three different colors as their label. 
// When a button is clicked, that particular color 
// is set as background color in the frame.

import java.awt.*;
import java.awt.event.*;

class event extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	} 
}

class myClass extends Frame implements ActionListener{
	myClass(){
		// Button 1
		Button b = new Button("Red");
		b.setBounds(100,120,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		b.addActionListener(this);
		addWindowListener(new event());
		
		// Button 2
		Button b1 = new Button("Yellow");
		b1.setBounds(100,160,80,30);
		add(b1);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		b.addActionListener(this);
		addWindowListener(new event());
	}
	
	public void actionPerformed(ActionEvent x){
		String str = x.getActionCommand();
		if(str.equals("Red"))this.setBackground(Color.red);
		else if(str.equals("Yellow"))this.setBackground(Color.yellow);
	} 
}

class Q1_Button_click_Color_chng{
	public static void main(String args[]){
		myClass f = new myClass();
		f.setTitle("Button Action");
	}
}