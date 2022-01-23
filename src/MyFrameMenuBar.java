import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrameMenuBar extends JFrame implements ActionListener {

    // declare menu bar as the container to contain all menu items
    JMenuBar menuBar;

    // declare Menu
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    // declare menu items
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    // declare icons
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrameMenuBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        // instantiate icons
        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");

        // create menu bar as the container to contain all menu items
        menuBar = new JMenuBar();

        // creates Menu and adds text "File, Edit, Help" to menubar
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        // creates menu items and text
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // add action listener to each menuItem
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // add icons to menuItems
        // NOTE: my icons are rather large and need to be resized
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        // Allow keyboard shortcuts
        // assign keyboard shortcut to select menu
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for help
        // assign keyboard shortcut to select menuItems
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        // adds menu items under "File" in form of drop down menu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);


        this.setVisible(true);
    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("* beep boop * you loaded a file.");
        }
        if (e.getSource() == saveItem) {
            System.out.println("* beep boop * you saved a file.");
        }
        if (e.getSource() == exitItem) {
            System.exit(0); // actually exits program
        }
    }
}
