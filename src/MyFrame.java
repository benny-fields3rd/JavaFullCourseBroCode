import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setSize(420,420); // this sets x dimension and y dimension
        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from being resized
        this.setVisible(true); // makes frame visible

        ImageIcon image = new ImageIcon("Windows_logo.jpg"); // create an ImageIcon - make sure to paste image in project directory
        this.setIconImage(image.getImage()); // change icon of frame
        // Change background colors
        //this.getContentPane().setBackground(Color.BLUE); // makes background BLUE
        //this.getContentPane().setBackground(new Color(123,50,250)); // makes custom background color using RGB values - this one is a like a twitch purple
        this.getContentPane().setBackground(new Color(0x123456)); // makes custom background color using Hexadecimal values - this one is a shade of materiel view
    }

}
