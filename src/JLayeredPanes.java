import javax.swing.*;
import java.awt.*;

public class JLayeredPanes {

    public static void main(String[] args) {

        // JLayeredPane = Swing container that provides a
        //                third dimension for positioning components
        //                ex. depth, Z-index




        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
