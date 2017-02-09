package persistence;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by danielsauve on 2017-01-26.
 */

public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {
}
