import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
class First extends Frame implements ActionListener{
	First(){
		Button a=new Button("Yellow");
		a.setBounds(30,100,80,30);
		Button b=new Button("Blue");
		b.setBounds(30,150,80,30);
		Button c=new Button("Pink");
		c.setBounds(30,200,80,30);
		add(a);
		add(b);
		add(c);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		addWindowListener(new MyClass());
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
	}
	//public void paint(Graphics g){
	//	this.setBackground(new Color (255,0,0));
	//}
	public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        if(str.equals("Yellow")) this.setBackground(Color.yellow);
        if(str.equals("Blue")) this.setBackground(Color.blue);
        if(str.equals("Pink")) this.setBackground(Color.pink);
    }
}
class Asgmt9_1{
	public static void main(String args[]){
		First f=new First();
		f.setTitle("My Button");
	}
}