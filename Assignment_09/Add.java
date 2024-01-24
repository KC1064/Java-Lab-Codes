import java.awt.event.*;

class myClass extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out(0);
	}
}

class AddDemo extends Frame implements ActionListener{
	TextField t1,t2,t3;
	Button b;
	
	AddDemo(){
		Frame f = new Frame();
		t1 = new TextField("Enter number: ");
		t1.setBounds(50,50,100,80);
		t2 = new TextField("Enter number: ");
		t2.setBounds(50,80,100,80);
		t3 = new TextField("Sum: ");
		t3.setBounds(50,100,100,80);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		b = new Button("Add");
		b.setBounds(50,120,100,80);
		f.add(b);
		b.addActionListener(this);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		addWindowListener(new myClass());
		
	}
	public void actionPerformed(ActionEvent x){
		String s1 = t1.getText();
		String s2 = t2.getText();
		if(s1.isEmpty() || s2.isEmpty()){
			t3.setText("Added Value");
		}
		else {
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a+b;
			String r = String.valueOf(c);
			t3.setText(r);
		}
	}
}

class Add {
	public static void main(String args[]){
		AddDemo d = new AddDemo();
		d.setTitle("Add 2 no.s");
	}
}
