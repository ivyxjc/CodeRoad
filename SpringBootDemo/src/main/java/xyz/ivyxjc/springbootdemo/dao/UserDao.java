package xyz.ivyxjc.springbootdemo.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import xyz.ivyxjc.springbootdemo.model.User;

import java.util.List;

@Mapper
public interface UserDao {

    @Results(id = "userResultMap")
    @Select("select * from user")
    List<User> getAllUsers();


    //    @Results(id = "userResultMap")
    @Select("SELECT * FROM USER WHERE userId=#{id}")
    User getUserById(int id);

}
