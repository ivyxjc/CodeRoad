package xyz.ivyxjc.springbootdemo.dao;

import springfox.documentation.annotations.Cacheable;
import xyz.ivyxjc.springbootdemo.model.User;

public interface BookRepository {
    @Cacheable("user")
    User getUserById(int id);
}
