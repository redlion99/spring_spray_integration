package com.rapple.store.mongodb.core.user;

import com.rapple.store.mongodb.core.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by libin on 14-11-7.
 */
@Document
public class Role extends AbstractDocument {

    private String name;

    private Set<Resource> Resources = new HashSet<Resource>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Resource> getResources() {
        return Resources;
    }

    public void setResources(Set<Resource> resources) {
        Resources = resources;
    }
}
