import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel2DAnimation extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 800;
    final int PANEL_HEIGHT = 800;

    Image rocket;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel2DAnimation() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        rocket = new ImageIcon("rocket.png").getImage();
        backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(5, this);
        timer.start(); // starts timer

    }

    public void paint(Graphics g) {

        super.paint(g); // paints background black

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage,0,0,null);

        g2D.drawImage(rocket,x,y,null); // adds rocket image to top left
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // NOTE if both are uncommented, the rocket will go diagonal
        // makes rocket go back and forth (left to right)
        if (x >= PANEL_WIDTH - rocket.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }

        x = x + xVelocity;

        // makes rocket go up and down
        if (y >= PANEL_HEIGHT - rocket.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }

        y = y + yVelocity;

        repaint(); // allows repaint the rocket (to move) without us resizing window

    }
}
