//Design an AWT GUI application (called AWT Counter). Each time the "Count" button is clicked, the counter value should increase by 1 and each time the Reset button is clicked the counter value should be reset to zero. 
import java.awt.*;
import java.awt.event.*;

class CounterApp extends Frame implements ActionListener {
    Button countButton, resetButton;
    TextField counterField;
    int counterValue;

    CounterApp() {
        counterValue = 0;

        counterField = new TextField(Integer.toString(counterValue));
        counterField.setBounds(50, 80, 200, 30);
        counterField.setEditable(false);
        add(counterField);

        countButton = new Button("Count");
        countButton.setBounds(50, 120, 80, 30);
        add(countButton);

        resetButton = new Button("Reset");
        resetButton.setBounds(150, 120, 80, 30);
        add(resetButton);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        countButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();

        if (action.equals("Count")) {
            counterValue++;
            counterField.setText(Integer.toString(counterValue));
        } else if (action.equals("Reset")) {
            counterValue = 0;
            counterField.setText(Integer.toString(counterValue));
        }
    }

}

class Asgmt9_5{
	public static void main(String args[]) {
        CounterApp counterApp = new CounterApp();
        counterApp.setTitle("AWT Counter");
    }
}
