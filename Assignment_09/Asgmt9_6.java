//Create three color buttons (with caption “Red”, “Blue” and “Green”) and a text label. Initially the text should be displayed in black color. When the user clicks on a particular color button the text should be changed to that particular color as shown in the figure.	
import java.awt.*;
import java.awt.event.*;

class ColorChangeDemo extends Frame implements ActionListener {
    Button redButton, blueButton, greenButton;
    Label textLabel;

    ColorChangeDemo() {
        redButton = new Button("Red");
        redButton.setBounds(50, 80, 80, 30);
        add(redButton);

        blueButton = new Button("Blue");
        blueButton.setBounds(50, 120, 80, 30);
        add(blueButton);

        greenButton = new Button("Green");
        greenButton.setBounds(50, 160, 80, 30);
        add(greenButton);

        textLabel = new Label("Hi I am Mrinal");
        textLabel.setBounds(150, 80, 150, 30);
        add(textLabel);

        setSize(300, 270);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String actionCommand = ae.getActionCommand();

        switch (actionCommand) {
            case "Red":
                textLabel.setForeground(Color.RED);
                break;
            case "Blue":
                textLabel.setForeground(Color.BLUE);
                break;
            case "Green":
                textLabel.setForeground(Color.GREEN);
                break;
        }
    }
}

class Asgmt9_6{
	public static void main(String args[]) {
        ColorChangeDemo colorChangeDemo = new ColorChangeDemo();
        colorChangeDemo.setTitle("Color Change Demo");
    }
}