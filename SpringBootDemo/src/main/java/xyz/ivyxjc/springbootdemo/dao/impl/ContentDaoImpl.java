package xyz.ivyxjc.springbootdemo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import xyz.ivyxjc.springbootdemo.dao.ContentDao;
import xyz.ivyxjc.springbootdemo.model.Content;

import java.util.List;


@Repository
public class ContentDaoImpl implements ContentDao {

    @Autowired
    private JdbcTemplate mJdbcTemplate;

    @Override
    public List<Content> findContentList() {
        List<Content> list = mJdbcTemplate.query("select * from content", new Object[]{}, new BeanPropertyRowMapper<>(Content.class));
        return list;
    }
}
