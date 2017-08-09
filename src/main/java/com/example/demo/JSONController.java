package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by Brice on 8/9/17.
 */

@RestController
public class JSONController {

    @Autowired
    UserRepo users;

    @Autowired
    EventRepo events;

    @PostConstruct
    public void init() {
        if (users.count() == 0) {
            User myUser = new User("David", "Turk");
            users.save(myUser);
        }
        User myUser = users.findByFirstName("David");
        if (events.count() == 0) {
            Event myEvent = new Event("Iron Pints", myUser);
            events.save(myEvent);
        }

        Iterable<Event> allEvents = events.findByUser(myUser);
        ArrayList<Event> myEvents = new ArrayList<>();
        for (Event currentEvent : allEvents) {
            myEvents.add(currentEvent);
        }

        System.out.println("First Name:" + users.findByFirstName("David").getFirstName());
        System.out.println("Event Name:" + myEvents.get(0).getName());

    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String test() {
        return "hi";
    }
}
