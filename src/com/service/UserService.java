package com.service;

import com.po.User;

import java.util.List;

public interface UserService {
    public List<User> selectUserByUsername(User user);

    public List<User> verifyUser(User user);

    public boolean addUser(User user);
}
