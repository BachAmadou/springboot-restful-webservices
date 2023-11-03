package com.dev.springboot.controller;

import com.dev.springboot.entity.User;
import com.dev.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    // create user REST API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
       User savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // create get a user REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(Long userId) {
        User getUser = userService.getUserById(userId);
        return new ResponseEntity<>(getUser, HttpStatus.OK);
    }

}





















