import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;

public class MyPanel extends JPanel {

    Image image;

    MyPanel() {

        image = new ImageIcon("bluebackground.png").getImage();
        this.setPreferredSize(new Dimension(500,500));

    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image,0,0,null);

        // draw line
        g2D.setPaint(Color.blue); // sets color of line
        //g2D.setStroke(new BasicStroke(5)); // sets thickness of line
        //g2D.drawLine(0,0,500,500); // created line starting from top left corner to bottom right

        // draw rectangle
        //g2D.setPaint(Color.pink); // sets color of line
        //g2D.drawRect(0,0,100,200); // draws a rectangle
        //g2D.fillRect(0,0,100,200); // fills rectangle with color from setPaint()

        // draw circle
        //g2D.setPaint(Color.orange);
        // g2D.drawOval(0,0,100,100);
        //g2D.fillOval(0,0,100,100); // fills oval with color from setPaint()

        // draw arc
        g2D.setPaint(Color.red);
        g2D.drawArc(0,0,100,100,0,180); // creates a half circle - upper
        g2D.fillArc(0,0,100,100,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(0,0,100,100,180,180);

        // draw polygon
        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);
        //g2D.drawPolygon(xPoints, yPoints,3);
        g2D.fillPolygon(xPoints, yPoints,3);

        // draw string of text
        //g2D.setPaint(Color.magenta);
        //g2D.setFont(new Font("Ink Free", Font.BOLD,50));
        //g2D.drawString("You are a WINNER! :D",50,50);



    }

}
