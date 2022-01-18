import javax.swing.*;
import java.awt.*;

public class Panels {

    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("dino_small.png");

        // create label
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon); // sets icon to label
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 75, 75);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        //redPanel.setLayout(new BorderLayout());
        // if you don't want to use setLayout, you can define up top and set setLayout to null
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        //bluePanel.setLayout(new BorderLayout());
        // if you don't want to use setLayout, you can define up top and set setLayout to null
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //greenPanel.setLayout(new BorderLayout());
        // if you don't want to use setLayout, you can define up top and set setLayout to null
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label); // adds label to greenPanel - change color panel to add label to that colored panel
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


    }

}
