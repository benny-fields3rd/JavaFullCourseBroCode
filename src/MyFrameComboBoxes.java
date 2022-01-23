import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameComboBoxes extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrameComboBoxes () {
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird"};
        // Important-must pass in datatype - if using primitive datatype such as double or int, you must use Wrapper Class as shown below
        //Integer[] animals = {1,2,3,4};
        //Double[] animals = {1,2,3,4};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            // gets item selected
            //System.out.println(comboBox.getSelectedItem());
            //get index of selection
            System.out.println(comboBox.getSelectedIndex());
        }

    }


}
