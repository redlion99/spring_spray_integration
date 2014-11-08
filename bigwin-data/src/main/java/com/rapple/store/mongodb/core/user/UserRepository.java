package com.rapple.store.mongodb.core.user;

import com.rapple.store.mongodb.core.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by libin on 14-11-7.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findOne(Long id);
    User save(User user);
}
