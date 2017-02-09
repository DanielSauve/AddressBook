import org.junit.Test;
import persistence.AddressBook;
import persistence.BuddyInfo;

import static org.junit.Assert.*;

import javax.persistence.*;

import java.util.List;
/**
 * Created by danielsauve on 2017-01-19.
 */
public class PersistenceTest {
    @Test
    public void test(){
        BuddyInfo buddyInfo = new BuddyInfo();
        buddyInfo.setName("Daniel");
        buddyInfo.setPhoneNumber("555-555-5555");

        BuddyInfo buddyInfo2 = new BuddyInfo();
        buddyInfo2.setName("Charles");
        buddyInfo2.setPhoneNumber("444-444-4444");

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.addBuddy(buddyInfo2);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(buddyInfo);
        entityManager.persist(buddyInfo2);
        entityManager.persist(addressBook);
        transaction.commit();

        Query q = entityManager.createQuery("SELECT buddyInfo FROM BuddyInfo buddyInfo");
        Query q2 = entityManager.createQuery("SELECT addressBook FROM AddressBook addressBook");

        List<BuddyInfo> results = q.getResultList();
        List<AddressBook> results2 = q2.getResultList();

        System.out.println("List of products\n----------------");
        assertEquals(results.get(1), buddyInfo);
        assertEquals(results.get(0), buddyInfo2);
        for (BuddyInfo buddyInfo1 : results) {
            System.out.println(buddyInfo1);
        }
        assertEquals(results2.get(0), addressBook);
        for (AddressBook addressBook1 : results2){
            System.out.println(addressBook1);
        }

        // Closing connection
        entityManager.close();

        emf.close();

    }
}
