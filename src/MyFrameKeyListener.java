import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrameKeyListener extends JFrame implements KeyListener {

    // declare label and image icon
    JLabel label;
    ImageIcon icon;

    MyFrameKeyListener() {
        // instantiate icon
        icon = new ImageIcon("rocket.png");
        // instantiate icon and label
        label = new JLabel();
        label.setBounds(0,0,300,300);
        //label.setBackground(Color.red); // sets label background color
        //label.setOpaque(true); //display background color - commented out for rocket icon use and using this.getContentPane().setBackground(Color.BLACK) below
        label.setIcon(icon); // changes label to be an icon (rocket image)

        // MyFrame constructor components
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // we will be manually moving components by using keystrokes
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK); // sets background color for rocket icon use
        this.add(label);
        this.setSize(1000,1000);
        this.setVisible(true);

    }

    // Override methods implemented automatically for implementing KeyListener
    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        // use switch or if's so when you press keys 'a,w,s,d' the label wil move around by pixel units
        // you can increase the speed by changing the -1 or +1 to greater numbers - "-10 and +10" are used below
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output i.e. 37 etc.
        // use switch or if's so when you press arrow keys - the label will move around by pixel units
        // you can increase the speed by changing the -1 or +1 to greater numbers - "-10 and +10" are used below
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 39: label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        // display keyChar for keys released
        System.out.println("You released key char: " + e.getKeyChar());
        // display keyCode for key released
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
