import java.awt.*;

public class NEWW extends Frame {
    Button b;

    // Constructor
    NEWW() {
        b = new Button("Click here");
        b.setBounds(12, 23, 80, 30); // better dimensions for visibility
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NEWW();
    }
}
