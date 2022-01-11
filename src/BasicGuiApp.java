import javax.swing.*;

public class BasicGuiApp {

    public static void main(String[] args) {

        // ask for user name displayed in dialogue box
        String name = JOptionPane.showInputDialog("Please enter your name");
        // take user input and display message in a show message dialogue box
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // ask for age and store input in a variable
        // int age = JOptionPane.showInputDialog("Enter your age");
        // One issue is when using this showInputDialogue, it will return a string. We are attempting to store the
        // value as an int. We need to convert to an int. We need to use Integer.parseInt() as shown below
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); // this will return a string and store the input as an int
        // take user input and display message in a show message dialogue box
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        // use double data type for height.
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); // this will return a string and store the input as an int
        // take user input and display message in a show message dialogue box
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");

    }

}
