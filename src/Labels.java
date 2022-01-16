import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {

    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("label_icon.png");
        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Do you even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set test LEFT, CENTER, or RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, or BOTTOM of imageIcon
        label.setForeground(Color.red); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(0); // set gap of texst to image
        label.setBackground(Color.yellow); // set background color
        label.setOpaque(true);  // display background color
        label.setBorder(border); // sets border of label (not image + text)
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
        //label.setBounds(100, 100, 400, 400); // set x, y, position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // resizes size of frame to accommodate all of the components that you have

    }

}
