import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");


    LaunchPage() {

        // create button and add to frame
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);


        // create frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==myButton) {
            // so you don't get multiple windows and only 1 window use .dispose()
            frame.dispose(); // closes frame with button (launch page) and open new window
            NewWindow myWindow = new NewWindow(); // event to perform when button is clicked
        }

    }

}
