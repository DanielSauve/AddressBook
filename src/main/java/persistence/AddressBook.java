package persistence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielsauve on 2017-01-12.
 */
@Entity
public class AddressBook {
    @Id
    @GeneratedValue
    private Long Id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = BuddyInfo.class)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(new BuddyInfo("Charles", "555-555-5555"));
        addressBook.addBuddy(new BuddyInfo("Chris", "444-444-4444"));
        addressBook.addBuddy(new BuddyInfo("David", "333-333-3333"));
        System.out.println(addressBook.toString());
    }

    public List<BuddyInfo> getBuddies(){
        return buddies;
    }
    public void addBuddy(BuddyInfo buddyInfo) {
        this.buddies.add(buddyInfo);
        buddyInfo.setAddressBook(this);
    }

    public BuddyInfo getBuddy(int i) {
        return this.buddies.get(i);
    }

    public void removeBuddy(int i) {
        BuddyInfo b = this.buddies.remove(i);
        b.setAddressBook(null);
    }

    @Override
    public String toString() {
        return "persistence.AddressBook{" +
                "buddies=" + buddies +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
