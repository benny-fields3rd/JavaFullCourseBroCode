import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrameMouseListener extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon astonished;
    ImageIcon happy;
    ImageIcon hot;
    ImageIcon sick;

    MyFrameMouseListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        // instantiate label
        label = new JLabel();
        label.addMouseListener(this);

        astonished = new ImageIcon("astonished.png");
        happy = new ImageIcon("happy.png");
        hot = new ImageIcon("hot.png");
        sick = new ImageIcon("sick.png");

        label.setIcon(happy);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        // instantiate label
        /*
        label.setBounds(0,0,500,500);

        label.setBackground(Color.red);
        label.setOpaque(true);

         */


        this.add(label);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("You clicked the mouse.");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        //label.setBackground(Color.yellow);
        label.setIcon(astonished);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse");
        //label.setBackground(Color.green);
        label.setIcon(hot);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("You entered the component");
        //label.setBackground(Color.blue);
        label.setIcon(sick);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("You exited the component");
        //label.setBackground(Color.red);
        label.setIcon(happy);
    }
}
