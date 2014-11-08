package com.rapple.store.mongodb.order;

import com.rapple.store.mongodb.core.AbstractDocument;
import com.rapple.store.mongodb.core.Address;
import com.rapple.store.mongodb.core.Customer;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by libin on 14-11-7.
 */

@Document
public class Order extends AbstractDocument {
    @DBRef
    private Customer customer;
    private Address shippingAddress;
    private Set<LineItem> lineItems = new HashSet<LineItem>();

    /**
     * Creates a new {@link Order} for the given {@link Customer}.
     *
     * @param customer must not be {@literal null}.
     * @param shippingAddress must not be {@literal null}.
     */
    public Order(Customer customer, Address shippingAddress) {
        this(customer, shippingAddress, null);
    }

    /**
     * Creates a new {@link Order} for the given {@link Customer}, shipping and billing {@link Address}.
     *
     * @param customer must not be {@literal null}.
     * @param shippingAddress must not be {@literal null}.
     * @param billingAddress can be {@literal null}.
     */
    @PersistenceConstructor
    public Order(Customer customer, Address shippingAddress, Address billingAddress) {

        Assert.notNull(customer);
        Assert.notNull(shippingAddress);

        this.customer = customer;
        this.shippingAddress = shippingAddress;
    }

    /**
     * Adds the given {@link LineItem} to the {@link Order}.
     *
     * @param lineItem
     */
    public void add(LineItem lineItem) {
        this.lineItems.add(lineItem);
    }

    /**
     * Returns the {@link Customer} who placed the {@link Order}.
     *
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }


    /**
     * Returns the shipping {@link Address} for this order;
     *
     * @return
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Returns all {@link LineItem}s currently belonging to the {@link Order}.
     *
     * @return
     */
    public Set<LineItem> getLineItems() {
        return Collections.unmodifiableSet(lineItems);
    }

    /**
     * Returns the total of the {@link Order}.
     *
     * @return
     */
    public BigDecimal getTotal() {

        BigDecimal total = BigDecimal.ZERO;

        for (LineItem item : lineItems) {
            total = total.add(item.getTotal());
        }

        return total;
    }
}
