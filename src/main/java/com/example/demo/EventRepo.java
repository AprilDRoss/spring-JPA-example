package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Brice on 8/9/17.
 */
public interface EventRepo extends CrudRepository<Event, Integer>{
    List<Event> findByUser(User user);
}
