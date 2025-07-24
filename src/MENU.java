import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class MENU {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ToolBar
        JToolBar toolBar = new JToolBar();
        JButton newBtn = new JButton("New");
        JButton saveBtn = new JButton("Save");
        newBtn.setToolTipText("Create a new file");
        saveBtn.setToolTipText("Save the current file");
        toolBar.add(newBtn);
        toolBar.add(saveBtn);
        frame.add(toolBar, "North");

        // Menu Bar
        JMenuBar menubar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F

        JMenuItem open = new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK)); // Ctrl + O

        JMenuItem close = new JMenuItem("Close");
        JCheckBoxMenuItem checkbox  = new JCheckBoxMenuItem("Enable Option");

        // Radio Buttons
        JRadioButtonMenuItem option1 = new JRadioButtonMenuItem("Option 1");
        JRadioButtonMenuItem option2 = new JRadioButtonMenuItem("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        fileMenu.add(checkbox);
        fileMenu.add(option1);
        fileMenu.add(option2);
        fileMenu.add(open);
        fileMenu.add(close);
        menubar.add(fileMenu);

        frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}
