package xyz.ivyxjc.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ivyxjc.springbootdemo.dao.UserDao;
import xyz.ivyxjc.springbootdemo.model.User;
import xyz.ivyxjc.springbootdemo.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao mUserDao;

    @Override
    public List<User> getAllUsers() {
        return mUserDao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return mUserDao.getUserById(id);
    }
}
