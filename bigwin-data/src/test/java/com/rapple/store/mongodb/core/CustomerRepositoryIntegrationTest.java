package com.rapple.store.mongodb.core;

import com.rapple.store.mongodb.AbstractIntegrationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

/**
 * Created by libin on 14-11-7.
 */
public class CustomerRepositoryIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    CustomerRepository repository;

    @Test
    public void createCustomer() {

    }
}
