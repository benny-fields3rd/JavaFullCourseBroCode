import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    // declare variables
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {

        // instantiate variables
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50); // default horizontal slider

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10); // how often do we want a notch

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true); // adds numbers to major ticks
        slider.setFont(new Font("MV Boli", Font.PLAIN,15));
        label.setFont(new Font("MV Boli", Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL); // makes slider vertical
        //slider.setOrientation(SwingConstants.HORIZONTAL); // makes slider horizontal

        // set text for label
        label.setText(slider.getValue() + " °F" );

        // create something to trigger our stateChanged method - add changeListener
        // when slider is moved or adjusted, the label text changes
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText(slider.getValue() + " °F" );
    }
}
