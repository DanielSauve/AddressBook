import org.junit.Before;
import org.junit.Test;
import persistence.AddressBook;
import persistence.BuddyInfo;

import static org.junit.Assert.*;

/**
 * Created by danielsauve on 2017-01-12.
 */
public class AddressBookTest {
    private AddressBook addressBook;
    @Test
    public void addBuddy() throws Exception {
        addressBook.addBuddy(new BuddyInfo("Test", "555-555-5555"));
        BuddyInfo buddyInfo = addressBook.getBuddy(0);
        assertEquals(buddyInfo.getName(), "Test");
        assertEquals(buddyInfo.getPhoneNumber(), "555-555-5555");
        addressBook.removeBuddy(0);
    }

    @Before
    public void setUp() throws Exception {
        this.addressBook = new AddressBook();
    }
}