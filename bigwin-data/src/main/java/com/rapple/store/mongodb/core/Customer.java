package com.rapple.store.mongodb.core;


import com.rapple.store.mongodb.core.user.User;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by libin on 14-11-7.
 */
@Document
public class Customer extends AbstractDocument {

    private String loginname;

    private String realname;

    @DBRef
    private User user;

    @Field("email")
    @Indexed(unique = true)
    private EmailAddress emailAddress;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    private Address shippingAddress;
    private Set<Address> addresses = new HashSet<Address>();

    /**
     * Creates a new {@link Customer} from the given firstname and lastname.
     *
     * @param user must not be {@literal null} or empty.
     * @param realname must not be {@literal null} or empty.
     */
    public Customer(User user,String realname) {

        Assert.notNull(user);
        Assert.hasText(realname);
        this.user=user;
        this.loginname=user.getUsername();
        this.realname=realname;
    }

    protected Customer() {

    }

    public String getLoginname() {
        return loginname;
    }

    public String getRealname() {
        return realname;
    }

    public User getUser() {
        return user;
    }

    /**
     * Adds the given {@link Address} to the {@link Customer}.
     *
     * @param address must not be {@literal null}.
     */
    public void add(Address address) {

        Assert.notNull(address);
        this.addresses.add(address);
    }



    /**
     * Returns the {@link EmailAddress} of the {@link Customer}.
     *
     * @return
     */
    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the {@link Customer}'s {@link EmailAddress}.
     *
     * @param emailAddress must not be {@literal null}.
     */
    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Return the {@link Customer}'s addresses.
     *
     * @return
     */
    public Set<Address> getAddresses() {
        return Collections.unmodifiableSet(addresses);
    }
}
