import persistence.AddressBook;
import persistence.BuddyInfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by danielsauve on 2017-01-26.
 */
public class MyActionListener implements ActionListener {
    AddressBook addressBook;
    MyJTextField textField1;
    MyJTextField textField2;

    public MyActionListener(AddressBook addressBook, MyJTextField textField1, MyJTextField textField2) {
        this.addressBook = addressBook;
        this.textField1 = textField1;
        this.textField2 = textField2;
    }

    public void actionPerformed(ActionEvent e) {
        addressBook.addBuddy(new BuddyInfo(textField1.getText(), textField2.getText()));
        System.out.println(addressBook);
    }
}
