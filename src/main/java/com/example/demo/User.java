package com.example.demo;

import javax.persistence.*;

/**
 * Created by Brice on 8/9/17.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int userId;

    @Column
    String firstName;

    @Column
    String lastName;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
