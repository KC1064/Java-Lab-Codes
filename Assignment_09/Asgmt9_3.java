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

        t3 = new TextField();
        t3.setBounds(50, 160, 200, 30);

        add(t1);
        add(t2);
        add(t3);

        b1 = new Button("+");
        b1.setBounds(50, 200, 80, 30);
        add(b1);

        b2 = new Button("-");
        b2.setBounds(150, 200, 80, 30);
        add(b2);

        setSize(300, 270);
        setLayout(null);
        setVisible(true);

        addWindowListener(new MyClass());

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("+")) {
            String p = t1.getText();
            String q = t2.getText();

            if (p.isEmpty() || q.isEmpty()) {
                t3.setText("Enter All values....!!!");
            } else {
                int sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                String s = "";
                s = s + sum;
                t3.setText(s);
            }
        } else if (str.equals("-")) {
            String p = t1.getText();
            String q = t2.getText();

            if (p.isEmpty() || q.isEmpty()) {
                t3.setText("Enter All values....!!!");
            } else {
                int difference = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                String s = "";
                s = s + difference;
                t3.setText(s);
            }
        }
    }
}

class Asgmt9_3{
	public static void main(String args[]) {
        AddDemo f = new AddDemo();
        f.setTitle("Addition and Subtraction");
    }
}
