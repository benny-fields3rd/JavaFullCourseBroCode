import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("happy.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point previousPoint;

    DragPanel(){

        imageCorner = new Point(0,0); // places it in the very top corner of image
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) { // repaints our image after we update new position of it
        super.paintComponent(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            previousPoint = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e){
            Point currentPoint = e.getPoint();

            imageCorner.translate(
                    (int)(currentPoint.getX() - previousPoint.getX()),
                    (int)(currentPoint.getY() - previousPoint.getY())
            );
            previousPoint = currentPoint;
            repaint();
        }
    }

}
