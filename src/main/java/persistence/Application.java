package persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by danielsauve on 2017-01-26.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository1, AddressBookRepository repository2) {
        return (args) -> {
            // save a couple of customers
            /*BuddyInfo buddyInfo1 = new BuddyInfo("Jack", "123");
            BuddyInfo buddyInfo2 = new BuddyInfo("Chloe", "456");
            BuddyInfo buddyInfo3 = new BuddyInfo("Kim", "789");
            BuddyInfo buddyInfo4 = new BuddyInfo("David", "012");
            BuddyInfo buddyInfo5 = new BuddyInfo("Michelle", "345");
            AddressBook addressBook = new AddressBook();
            addressBook.addBuddy(buddyInfo1);
            addressBook.addBuddy(buddyInfo2);
            addressBook.addBuddy(buddyInfo3);
            addressBook.addBuddy(buddyInfo4);
            addressBook.addBuddy(buddyInfo5);

            //
            repository2.save(addressBook);
            repository1.save(buddyInfo1);
            repository1.save(buddyInfo2);
            repository1.save(buddyInfo3);
            repository1.save(buddyInfo4);
            repository1.save(buddyInfo5);

            for (BuddyInfo buddyInfo : repository1.findAll()) {
                System.out.println(buddyInfo.toString());
            }

            BuddyInfo buddyInfo = repository1.findOne(1L);
            System.out.println(buddyInfo);

            AddressBook addressBook1 = repository2.findOne(1L);
            System.out.println(addressBook1);

            for(BuddyInfo buddyInfo7 : repository1.findByName("Jack")){
                System.out.println(buddyInfo7);
            }*/
        };
    }
}
