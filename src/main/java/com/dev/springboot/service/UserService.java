package com.dev.springboot.service;

import com.dev.springboot.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);
}
