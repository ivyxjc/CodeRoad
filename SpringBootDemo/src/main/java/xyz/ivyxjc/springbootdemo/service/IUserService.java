package xyz.ivyxjc.springbootdemo.service;

import xyz.ivyxjc.springbootdemo.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(int id);
}
