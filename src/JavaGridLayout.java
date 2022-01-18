import javax.swing.*;
import java.awt.*;

public class JavaGridLayout {

    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container
        // GridLayout = 	places components in a grid of cells.
        //					Each component takes all the available space within its cell,
        //					and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,0));

        // create buttons
        // original way to create button and add text to button
        //JButton button1 = new JButton("1");
        // better way to do the same with less code
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));



        frame.setVisible(true);



    }

}
