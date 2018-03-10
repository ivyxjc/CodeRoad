package xyz.ivyxjc.springbootdemo.dao.impl;

import org.springframework.stereotype.Repository;
import springfox.documentation.annotations.Cacheable;
import xyz.ivyxjc.springbootdemo.dao.BookRepository;
import xyz.ivyxjc.springbootdemo.model.User;


@Repository
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("user")
    public User getUserById(int id) {
        simulateSlowService();
        User user = new User();
        user.setUserId(13);
        user.setUsername("hello");
        user.setPassword("1234");
        return user;
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
