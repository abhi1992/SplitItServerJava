package com.purpleteaches.splitit2.controllers;

import com.purpleteaches.splitit2.exceptions.InvalidUserException;
import com.purpleteaches.splitit2.models.User;
import com.purpleteaches.splitit2.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new InvalidUserException(id, "User Not Found"));
    }

    @PostMapping("register/")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
