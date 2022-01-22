import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameRadioButtons extends MyFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    // create ImageIcons for each image
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    // create constructor
    MyFrameRadioButtons() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // instantiate ImageIcons
        pizzaIcon = new ImageIcon("pizza.png");
        hamburgerIcon = new ImageIcon("hamburger.png");
        hotdogIcon = new ImageIcon("hotdog.png");

        // create radio buttons
        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        // add ImageIcons to radio buttons
        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        // create button group
        ButtonGroup group = new ButtonGroup();
        // add radio buttons to group to allow user to only select one at a time
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        // add action event listener to each button
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        // add buttons to frame
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        }
        else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        }
        else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
