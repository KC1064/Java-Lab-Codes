// Write a java awt program, which will create 2 text field and one button labelled as Factorial. The user will enter a number in the 1st text field and upon pressing the button it will display the Factorial of the number in the 2nd text field.

import java.awt.*;
import java.awt.event.*;

class MyClass extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class AddDemo extends Frame implements ActionListener {
    Button b1, b2; 
    TextField t1, t2, t3;

    AddDemo() {
        t1 = new TextField("");
        t1.setBounds(50, 80, 200, 30);

        t2 = new TextField("");
        t2.setBounds(50, 120, 200, 30);
        
        add(t1);
        add(t2);
        

        b1 = new Button("Factorial");
        b1.setBounds(50, 200, 80, 30);
        add(b1);

        setSize(300, 270);
        setLayout(null);
        setVisible(true);

        addWindowListener(new MyClass());

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("Factorial")) {
            String p = t1.getText();
            
            if (p.isEmpty()) {
                t2.setText("Enter value....!!!");
            } else {
                int num = Integer.parseInt(t1.getText());
                String s = "";
                int fact = 1;
                if(num==0){
                	fact = 1;
                }
                else{
                	for(int i=1;i<=num;i++){
                		fact=fact*i;
                	}
                s = s + fact;
                t2.setText(s);
                }

            }
        }
        }
}

class Asgmt9_4{
	public static void main(String args[]) {
        AddDemo f = new AddDemo();
        f.setTitle("Factorial");
    }
}
