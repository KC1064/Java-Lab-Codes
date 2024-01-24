import java.awt.*;
import java.awt.event.*;
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
class AddDemo extends Frame implements ActionListener{
    Button b;
    TextField t1,t2,t3;
	AddDemo(){
		Frame f= new Frame();
		t1= new TextField("Enter the first number");
        t1.setBounds(50,80,200,30);
        t2= new TextField("Enter the second number");
        t2.setBounds(50,120,200,30);
        t3= new TextField();
        t3.setBounds(50,160,200,30);
        add(t1);
        add(t2);
        add(t3);
		b=new Button("Add");
		b.setBounds(50,200,80,30);
		add(b);
		setSize(300,270);
		setLayout(null);
		setVisible(true);
		//setLayout()
		addWindowListener(new MyClass());
		b.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        if(str.equals("Add")){
        			String p=t1.getText();
		String q=t2.getText();
        	if(p.isEmpty() || q.isEmpty()){
			t3.setText("Enter All values....!!!");
		}
		else{
			int sum= Integer.parseInt(t1.getText())+ Integer.parseInt(t2.getText());
			String s="";
			s=s+sum;
			t3.setText(s);
		}
		}
    }
}
class Asgmt9_2{
	public static void main(String args[]){
		AddDemo f=new AddDemo();
		f.setTitle("Addition");
	}
}