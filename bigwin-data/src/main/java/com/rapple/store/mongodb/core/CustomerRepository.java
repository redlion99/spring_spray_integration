package com.rapple.store.mongodb.core;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by libin on 14-11-7.
 */
public interface CustomerRepository extends Repository<Customer, Long> {
    /**
     * Returns the customer with the given identifier.
     *
     * @param id
     * @return
     */
    Customer findOne(Long id);

    /**
     * Saves the given {@link Customer}. #
     *
     * @param customer
     * @return
     */
    Customer save(Customer customer);

    /**
     * Returns the {@link Customer} with the given {@link EmailAddress}.
     *
     * @param emailAddress
     * @return
     */
    Customer findByEmailAddress(EmailAddress emailAddress);
}
