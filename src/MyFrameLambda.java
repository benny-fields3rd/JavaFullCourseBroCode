import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameLambda extends JFrame {


    JButton myButton = new JButton("MY BUTTON1");
    JButton myButton2 = new JButton("MY BUTTON2");

    MyFrameLambda(){

        // create button
        myButton.setBounds(100,100,200,100);

        // use lambda
        myButton.addActionListener(e -> System.out.println("You clicked on button1!"));

        // create button
        myButton2.setBounds(100,200,200,100);

        // use lambda
        myButton2.addActionListener(e -> System.out.println("You clicked on button2!"));

        this.add(myButton);
        this.add(myButton2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);



    }

}
