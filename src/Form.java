import java.awt.*;
import javax.swing.*;

public class Form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Application");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);

JMenuBar menubar = new JMenuBar();
JMenu menu = new JMenu("File");
JMenuItem newItem = new JMenuItem("New");
JMenuItem saveItem = new JMenuItem("Save");
JMenuItem exitItem = new JMenuItem("Exit");

menu.add(newItem);
menu.add(saveItem);
menu.add(exitItem);

menubar.add(menu);

frame.add(menubar,BorderLayout.NORTH);

        // Show frame
        frame.setVisible(true);
    }
}
