package xyz.ivyxjc.springbootdemo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.ivyxjc.springbootdemo.model.User;
import xyz.ivyxjc.springbootdemo.service.IUserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService mUserService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return mUserService.getAllUsers();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id) {
        return mUserService.getUserById(id);
    }

    @RequestMapping(value = "/doSomething", method = RequestMethod.GET)
    public void doSomething() {
        mUserService.doSomething();
    }

    @RequestMapping(value = "/doSome", method = RequestMethod.GET)
    public void doSome() {
        mUserService.doSome();
    }

}
