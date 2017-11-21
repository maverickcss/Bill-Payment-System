package com.boot.service;

import com.boot.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
