import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameCheckbox extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkbox;
    ImageIcon checkIcon;
    ImageIcon xIcon;

    MyFrameCheckbox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        checkIcon = new ImageIcon("checkmark.png");
        xIcon = new ImageIcon("x.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkbox = new JCheckBox();
        checkbox.setText("I'm not a robot.");
        checkbox.setFocusable(false); // gets rid of box around text
        checkbox.setFont(new Font("Consolas", Font.PLAIN,35));
        checkbox.setIcon(xIcon); // replaces checkbox with icon
        checkbox.setSelectedIcon(checkIcon); // when you click on icon, it toggles icon

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println(checkbox.isSelected()); // when button is clicked/pressed, it wil display true or false if checkbox is checked or not
        }

    }
}
