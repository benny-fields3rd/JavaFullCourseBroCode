import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;

public class MyFrame2DGraphics extends JFrame {

    MyPanel panel;

    MyFrame2DGraphics() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }



}
