import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public void init() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setSize(new Dimension(300, 300));
                setVisible(true);
            }
        });
    }
}
