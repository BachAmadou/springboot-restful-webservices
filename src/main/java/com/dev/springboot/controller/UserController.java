package com.dev.springboot.controller;

import com.dev.springboot.entity.User;
import com.dev.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId) {
        User getUser = userService.getUserById(userId);
        return new ResponseEntity<>(getUser, HttpStatus.OK);
    }

    // create get all the users REST API
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

}





















