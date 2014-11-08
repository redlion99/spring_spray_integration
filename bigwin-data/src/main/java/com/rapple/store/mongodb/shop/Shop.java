package com.rapple.store.mongodb.shop;

import com.rapple.store.mongodb.core.AbstractDocument;
import com.rapple.store.mongodb.core.Address;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by libin on 14-11-7.
 */
@Document
public class Shop extends AbstractDocument {
    private Address address;
}
