package xyz.ivyxjc.springbootdemo.service;

import org.springframework.transaction.annotation.Transactional;
import xyz.ivyxjc.springbootdemo.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(int id);

    @Transactional
    void doSomething();

    void doSome();
}
