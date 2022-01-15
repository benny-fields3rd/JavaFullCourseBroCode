import javax.swing.*;
import java.awt.*;

public class JavaGUI {

    public static void main(String[] args) {

        // JFrame = a GUI window to add components to
        /*
        JFrame frame = new JFrame(); // creates a frame
        frame.setSize(420,420); // this sets x dimension and y dimension
        frame.setTitle("JFrame title goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setVisible(true); // makes frame visible

        ImageIcon image = new ImageIcon("Windows_logo.jpg"); // create an ImageIcon - make sure to paste image in project directory
        frame.setIconImage(image.getImage()); // change icon of frame
        // Change background colors
        //frame.getContentPane().setBackground(Color.BLUE); // makes background BLUE
        //frame.getContentPane().setBackground(new Color(123,50,250)); // makes custom background color using RGB values - this one is a like a twitch purple
        frame.getContentPane().setBackground(new Color(0x123456)); // makes custom background color using Hexadecimal values - this one is a shade of materiel view
        */

        // A better way is to create a MyFrame class and paste the above commented out code into the class - see MyFrame.java file.
        // if naming a frame use:
        MyFrame myFrame = new MyFrame();
        // if not using a name, you can do the following:
        //new MyFrame();


    }

}
