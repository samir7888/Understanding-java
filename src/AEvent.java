import javax.swing.*;
import java.awt.event.*;

public class AEvent extends JFrame implements MouseListener {
    JTextField tf;
    JButton btn;
    JTextArea ta;

    AEvent() {
        tf = new JTextField();
        tf.setBounds(40, 60, 200, 30);
        add(tf);

        ta = new JTextArea();
        ta.setBounds(40, 120, 300, 100);
        add(ta);

        btn = new JButton("Click me");
        btn.setBounds(40, 240, 100, 30);
        add(btn);

        // Using MouseAdapter for mouse events
        ta.addMouseListener(this);

        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        tf.setText("Mouse entered TextArea!");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        tf.setText("Mouse clicked in TextArea!");
    }
              @Override
          public void mouseExited(MouseEvent e) {
               tf.setText("Mouse exited TextArea!");
            }
    @Override
    public void mouseEntered(MouseEvent e) {
        tf.setText("Mouse entered TextArea!");
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }



    public static void main(String[] args) {
        new AEvent();
    }
}
