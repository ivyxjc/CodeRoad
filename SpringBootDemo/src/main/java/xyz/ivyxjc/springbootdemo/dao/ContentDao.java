package xyz.ivyxjc.springbootdemo.dao;

import xyz.ivyxjc.springbootdemo.model.Content;

import java.util.List;

public interface ContentDao {
    List<Content> findContentList();
}
