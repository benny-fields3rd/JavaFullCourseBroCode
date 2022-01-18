import javax.swing.*;
import java.awt.*;

public class JavaFlowLayout {

    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container
        // FlowLayout = 	places components in a row, sized at their preferred size.
        //					If the horizontal space in the container is too small,
        //					the FlowLayout class uses the next available row.

        // Create a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // FlowLayout allows for when resizing of window occurs, the buttons automatically re-arrange themselves based on size of frame
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // default is CENTER

        // create panel to use inside of JFrame
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true); // moved to very end because sometimes the buttons don't appear unless you resize or move window.

    }

}
