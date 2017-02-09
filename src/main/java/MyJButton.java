import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by danielsauve on 2017-01-26.
 */
public class MyJButton extends JButton {
    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
        this.setText("Add Buddy");
    }
}
