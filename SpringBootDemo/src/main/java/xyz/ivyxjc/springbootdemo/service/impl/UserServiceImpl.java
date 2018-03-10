package xyz.ivyxjc.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional
    @Override
    public void doSomething() {
        User user = new User();
        user.setUserId(4);
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setDescription("hello");
        mUserDao.updateUser(user);
        int i = 1 / 0;
        user.setUsername("zhangzhang");
        user.setPassword("654321");
        user.setDescription("he");
        mUserDao.updateUser(user);
    }

    @Override
    public void doSome() {
        User user = new User();
        user.setUserId(4);
        user.setUsername("zhangan");
        user.setPassword("123489");
        user.setDescription("good");
        mUserDao.updateUser(user);
    }


}
