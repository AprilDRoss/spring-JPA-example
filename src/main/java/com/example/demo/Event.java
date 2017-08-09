package com.example.demo;

import javax.persistence.*;

/**
 * Created by Brice on 8/9/17.
 */
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    int eventId;

    @Column
    String name;

    @OneToOne
    User user;

    public Event() {
    }

    public Event(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
