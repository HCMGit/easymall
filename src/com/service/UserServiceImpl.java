package com.service;

import com.dao.UserDao;
import com.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectUserByUsername(User user) {
        return userDao.selectUserByUsername(user);
    }

    @Override
    public List<User> verifyUser(User user) {
        return userDao.verifyUser(user);
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }


}
