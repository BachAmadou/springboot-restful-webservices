package com.dev.springboot.service.impl;

import com.dev.springboot.entity.User;
import com.dev.springboot.repository.UserRepository;
import com.dev.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
