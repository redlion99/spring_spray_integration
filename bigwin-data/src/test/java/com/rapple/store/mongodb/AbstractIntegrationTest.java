package com.rapple.store.mongodb;

import com.mongodb.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.assertThat;

/**
 * Created by libin on 14-11-7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public abstract class AbstractIntegrationTest {

    //protected ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
    //protected ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");

    @Autowired
    Mongo mongo;

    @Before
    public void setUp() {

        //MongoDbFactory factory=(MongoDbFactory)context.getBean("mongoDbFactory");

        //DB database = factory.getDb();
        DB database=mongo.getDB("estore");

        // Customers

        DBCollection customers = database.getCollection("customer");
        customers.remove(new BasicDBObject());

        BasicDBObject address = new BasicDBObject();
        address.put("city", "New York");
        address.put("street", "Broadway");
        address.put("country", "United States");

        BasicDBList addresses = new BasicDBList();
        addresses.add(address);

        DBObject dave = new BasicDBObject("firstname", "Dave");
        dave.put("lastname", "Matthews");
        dave.put("email", "dave@dmband.com");
        dave.put("addresses", addresses);

        customers.insert(dave);

        // Products

        DBCollection products = database.getCollection("product");
        products.drop();

        DBObject iPad = new BasicDBObject("name", "iPad");
        iPad.put("description", "Apple tablet device");
        iPad.put("price", 499.0);
        iPad.put("attributes", new BasicDBObject("connector", "plug"));

        DBObject macBook = new BasicDBObject("name", "MacBook Pro");
        macBook.put("description", "Apple notebook");
        macBook.put("price", 1299.0);

        BasicDBObject dock = new BasicDBObject("name", "Dock");
        dock.put("description", "Dock for iPhone/iPad");
        dock.put("price", 49.0);
        dock.put("attributes", new BasicDBObject("connector", "plug"));

        products.insert(iPad, macBook, dock);

        // Orders

        DBCollection orders = database.getCollection("order");
        orders.drop();

        // Line items

        DBObject iPadLineItem = new BasicDBObject("product", iPad);
        iPadLineItem.put("amount", 2);

        DBObject macBookLineItem = new BasicDBObject("product", macBook);
        macBookLineItem.put("amount", 1);

        BasicDBList lineItems = new BasicDBList();
        lineItems.add(iPadLineItem);
        lineItems.add(macBookLineItem);

        DBObject order = new BasicDBObject("customer", new DBRef(database, "customer", dave.get("_id")));
        order.put("lineItems", lineItems);
        order.put("shippingAddress", address);

        orders.insert(order);
    }
}
