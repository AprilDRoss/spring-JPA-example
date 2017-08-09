package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brice on 8/9/17.
 */
public interface UserRepo extends CrudRepository<User, Integer> {
    User findByFirstName(String firstName);
}
