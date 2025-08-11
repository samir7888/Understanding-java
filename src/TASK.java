import javax.swing.*;
import java.awt.*;
public class TASK {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is form");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTextField name = new JTextField("Enter your name");
        name.setBounds(20,20,200,60);
        JTextField password = new JTextField("Enter your password");
        password.setBounds(20,80,200,60);
        JTextField hobbies = new JTextField("Enter your hobbies");
        hobbies.setBounds(20,120,200,60);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        frame.add(name);
        frame.add(password);
        frame.add(hobbies);
//        frame.add(male);
//        frame.add(female);

//        frame.add(panel);


        frame.setVisible(true);

    }
}
