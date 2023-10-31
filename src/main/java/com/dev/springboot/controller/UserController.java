package com.dev.springboot.controller;

import com.dev.springboot.entity.User;
import com.dev.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    // build create REST API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
       User savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}





















