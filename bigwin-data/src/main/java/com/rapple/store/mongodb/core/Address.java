package com.rapple.store.mongodb.core;

import org.springframework.util.Assert;

/**
 * Created by libin on 14-11-7.
 */
public class Address {
    private final String street, city, province;

    /**
     * Creates a new {@link Address} from the given street, city and province.
     *
     * @param street must not be {@literal null} or empty.
     * @param city must not be {@literal null} or empty.
     * @param country must not be {@literal null} or empty.
     */
    public Address(String street, String city, String country) {

        Assert.hasText(street, "Street must not be null or empty!");
        Assert.hasText(city, "City must not be null or empty!");
        Assert.hasText(country, "Country must not be null or empty!");

        this.street = street;
        this.city = city;
        this.province = country;
    }

    /**
     * Returns a copy of the current {@link Address} instance which is a new entity in terms of persistence.
     *
     * @return
     */
    public Address getCopy() {
        return new Address(this.street, this.city, this.province);
    }

    /**
     * Returns the street.
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns the city.
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the province.
     *
     * @return
     */
    public String getProvince() {
        return province;
    }
}
