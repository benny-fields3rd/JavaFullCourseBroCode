import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame2() {

        ImageIcon icon = new ImageIcon("dino_small.png");
        ImageIcon icon2 = new ImageIcon("sun2.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("I am a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true); //
        this.add(button); // adds button to JFrame
        this.add(label); // adds icon2 (sun) to JFrame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            //System.out.println("Poo");
            //button.setEnabled(false); // allows only one click and then disables button
            label.setVisible(true); // once button is clicked, sun icon will appear
        }
    }

}
