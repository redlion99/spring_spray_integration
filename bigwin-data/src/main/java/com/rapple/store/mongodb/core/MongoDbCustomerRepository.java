package com.rapple.store.mongodb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import static org.springframework.data.mongodb.core.query.Criteria.*;
import static org.springframework.data.mongodb.core.query.Query.*;

/**
 * Created by libin on 14-11-7.
 */

@Repository
@Profile("mongodb")
public class MongoDbCustomerRepository implements CustomerRepository {

    private final MongoOperations operations;

    /**
     * Creates a new {@link MongoDbCustomerRepository} using the given {@link MongoOperations}.
     *
     * @param operations must not be {@literal null}.
     */
    @Autowired
    public MongoDbCustomerRepository(MongoOperations operations) {

        Assert.notNull(operations);
        this.operations = operations;
    }

    /*
     * (non-Javadoc)
     * @see com.oreilly.springdata.mongodb.core.CustomerRepository#findOne(java.lang.Long)
     */
    @Override
    public Customer findOne(Long id) {

        Query query = query(where("id").is(id));
        return operations.findOne(query, Customer.class);
    }

    /*
     * (non-Javadoc)
     * @see com.oreilly.springdata.mongodb.core.CustomerRepository#save(com.oreilly.springdata.mongodb.core.Customer)
     */
    @Override
    public Customer save(Customer customer) {

        operations.save(customer);
        return customer;
    }

    /*
     * (non-Javadoc)
     * @see com.oreilly.springdata.mongodb.core.CustomerRepository#findByEmailAddress(com.oreilly.springdata.mongodb.core.EmailAddress)
     */
    @Override
    public Customer findByEmailAddress(EmailAddress emailAddress) {

        Query query = query(where("emailAddress").is(emailAddress));
        return operations.findOne(query, Customer.class);
    }
}
