package persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by danielsauve on 2017-01-26.
 */


public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByName(String name);
}
