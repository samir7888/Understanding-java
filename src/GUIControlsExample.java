import javax.swing.*;
import java.awt.*;

public class GUIControlsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Controls Example");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 1, 5, 5));

        JTextField textField = new JTextField("Enter name");
        JPasswordField passwordField = new JPasswordField();
        JTextArea textArea = new JTextArea(3, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JLabel label = new JLabel("This is a label");
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JCheckBox cb1 = new JCheckBox("C++");
        JCheckBox cb2 = new JCheckBox("Java");

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2);

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Nepal", "India", "China"});
        JSlider slider = new JSlider(0, 100, 50);

        panel.add(textField);
        panel.add(passwordField);
        panel.add(scrollPane);
        panel.add(label);
        panel.add(cb1);
        panel.add(cb2);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(comboBox);
        panel.add(slider);

        frame.add(panel);
        frame.setVisible(true);
    }
}
