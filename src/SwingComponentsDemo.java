import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("All Swing Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());





        // Tabbed Pane to organize components
        JTabbedPane tabbedPane = new JTabbedPane();

        // Dialog Buttons Panel
        JPanel dialogPanel = new JPanel();

        JButton msgBtn = new JButton("Message Dialog");
        msgBtn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello!"));


        JButton confirmBtn = new JButton("Confirm Dialog");
        confirmBtn.addActionListener(e -> JOptionPane.showConfirmDialog(frame, "Do you want to exit?"));
        JButton colorBtn = new JButton("Color Chooser");
        colorBtn.addActionListener(e -> JColorChooser.showDialog(frame, "Choose Color", Color.RED));
        JButton fileBtn = new JButton("File Chooser");
        fileBtn.addActionListener(e -> new JFileChooser().showOpenDialog(frame));
        dialogPanel.add(msgBtn);
        dialogPanel.add(confirmBtn);
        dialogPanel.add(colorBtn);
        dialogPanel.add(fileBtn);

        tabbedPane.addTab("Dialogs", dialogPanel);

        // Table Panel
        String[][] data = { {"1", "Alice"}, {"2", "Bob"} };
        String[] columns = {"ID", "Name"};
        JTable table = new JTable(data, columns);
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);
        tabbedPane.addTab("Table", tablePanel);

        // Tree Panel
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        root.add(new DefaultMutableTreeNode("Child 1"));
        root.add(new DefaultMutableTreeNode("Child 2"));
        JTree tree = new JTree(root);
        JPanel treePanel = new JPanel(new BorderLayout());
        treePanel.add(new JScrollPane(tree), BorderLayout.CENTER);
        tabbedPane.addTab("Tree", treePanel);

        // Internal Frame Panel
        JDesktopPane desktop = new JDesktopPane();
        JInternalFrame internal = new JInternalFrame("Internal Frame", true, true, true, true);
        internal.setSize(200, 100);
        internal.setVisible(true);
        desktop.add(internal);
        tabbedPane.addTab("Internal Frame", desktop);

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
