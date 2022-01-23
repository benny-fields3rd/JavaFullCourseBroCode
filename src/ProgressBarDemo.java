import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);


    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0,0,420,50); // using because we are not using layout manager
        bar.setStringPainted(true); // adds percentage to progress bar that is dynamic as bar fills or changes
        bar.setFont(new Font("MV Boli", Font.BOLD,25)); // set font
        bar.setForeground(Color.red); // set color of fill color for bar
        bar.setBackground(Color.BLACK); // set background color of progress bar

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    // basically fills up progress bar 10 percent each second
    public void fill() {
        int counter = 0;

        while(counter<= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50); // pauses program for specified time (1000 millis = 1 sec) after each iteration of while loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1; // unit of progress bar to fill - this is filling 1 unit
        }
        bar.setString("Done! :)"); // once progress bar is complete, text will display
    }

}
