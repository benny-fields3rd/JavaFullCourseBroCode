import javax.swing.*;

public class MyFrame2DAnimation extends JFrame {

    MyPanel2DAnimation panel;

    MyFrame2DAnimation() {

        panel = new MyPanel2DAnimation();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
