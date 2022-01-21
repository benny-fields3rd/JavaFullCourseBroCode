import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame3 extends JFrame implements ActionListener {

    // declare button and textfield
    JButton button;
    JTextField textField;

    // create MyFrame3 constructor
    MyFrame3() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // create button with text
        button = new JButton("Submit");
        // add action listener to give function/ action to button
        button.addActionListener(this);

        // create text-field and attributes/characteristics
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.white);
        textField.setText("username");


        this.add(button);
        this.add(textField);
        this.pack(); // size of frame will adjust to fit the components we add
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println("Welcome " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false); // disables editing of textfield

        }
    }
}
