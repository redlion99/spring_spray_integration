package com.rapple.store.mongodb.core.user;

import com.rapple.store.mongodb.core.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by libin on 14-11-7.
 */
@Document
public class User extends AbstractDocument {
    private String username;
    private String password;

    private Set<Role> roles=new HashSet<Role>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
