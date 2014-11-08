package com.rapple.store.mongodb.product;

/**
 * Created by libin on 14-11-7.
 */
public class Category {
    private String name;
    private Category firstLevel;
    private Category secondLevel;

    public Category(String name, Category firstLevel, Category secondLevel) {
        this.name = name;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(Category secondLevel) {
        this.secondLevel = secondLevel;
    }

    public Category getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(Category firstLevel) {
        this.firstLevel = firstLevel;
    }
}
