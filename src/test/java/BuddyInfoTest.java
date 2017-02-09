import org.junit.Before;
import org.junit.Test;
import persistence.BuddyInfo;

import static org.junit.Assert.*;

/**
 * Created by danielsauve on 2017-01-12.
 */
public class BuddyInfoTest {
    private BuddyInfo buddyInfo;
    @Test
    public void getName() throws Exception {
        assertEquals(buddyInfo.getName(), "Daniel");
    }

    @Test
    public void getPhoneNumber() throws Exception {
        assertEquals(buddyInfo.getPhoneNumber(), "555-555-5555");
    }

    @Test
    public void setName() throws Exception {
        buddyInfo.setName("Test");
        assertEquals(buddyInfo.getName(), "Test");
    }

    @Test
    public void setPhoneNumber() throws Exception {
        buddyInfo.setPhoneNumber("343-434-3434");
        assertEquals(buddyInfo.getPhoneNumber(), "343-434-3434");
    }

    @Before
    public void setUp() throws Exception {
        this.buddyInfo = new BuddyInfo("Daniel", "555-555-5555");
    }
}