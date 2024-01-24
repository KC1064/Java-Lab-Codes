
import java.awt.*;
import java.awt.event.*;

class event extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	} // To add event listerner to close window
}

class myClass extends Frame {
	myClass(){
		Button b = new Button("Click me");
		b.setBounds(100,120,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		addWindowListener(new event());
	}
	
	public void paint(Graphics g){
		this.setBackground(Color.yellow);
	} // To fill color
}

class AWT_01{
	public static void main(String args[]){
		myClass x = new myClass();
		x.setTitle("AWT");
	}
}