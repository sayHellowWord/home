package com.home.modules.test.entity;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    // ==============
    // PRIVATE FIELDS
    // ==============
    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // The user email
    @NotNull
    private String email;
    // The user name
    @NotNull
    private String name;
    // ==============
    // PUBLIC METHODS
    // ==============
    public User() { }
    public User(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
