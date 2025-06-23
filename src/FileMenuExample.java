import javax.swing.*;
import java.awt.event.*;

public class FileMenuExample extends JFrame {

    public FileMenuExample() {
        setTitle("Menu Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to the File menu
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Optional line separator
        fileMenu.add(exitItem);

        // Add File menu to menu bar
        menuBar.add(fileMenu);

        // Add menu bar to the frame
        setJMenuBar(menuBar);

        // Add action listener for Exit
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the program
            }
        });

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new FileMenuExample();
    }
}
