import javax.swing.*;

public class DialogueBoxesJOptionPane {


    public static void main(String[] args) {

        //JOptionPane = pop up a standard dialog box that prompts users for a value
        //				or informs them of something.

        // displays a dialogue box with plain message
        //JOptionPane.showMessageDialog(null, "This is some useless info.", "title", JOptionPane.PLAIN_MESSAGE);
        // displays an icon with an "i" and message
        //JOptionPane.showMessageDialog(null, "Here is more useless info.", "title", JOptionPane.INFORMATION_MESSAGE);
        // displays an icon with question mark
        //JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
        // displays icon with exclamation mark
        //JOptionPane.showMessageDialog(null, "Your computer has a VIRUS", "title", JOptionPane.WARNING_MESSAGE);
        // displays icon with red x with a stop sign shaped icon
        //JOptionPane.showMessageDialog(null, "Call tech support now!", "title", JOptionPane.ERROR_MESSAGE);

        // yes, no, option box
        //int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

        // showInputDialog - allows user to input something
        //String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println("Hello " + name);

        // create an array of strings
        String[] responses = {"No, you are awesome",  "Thank you", "*blush*"};

        // create icon
        ImageIcon icon = new ImageIcon("sun2.png");

        // showOptionDialoge - combines all of them together
        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses, // adds text to each button from string array
                0);

    }

}
