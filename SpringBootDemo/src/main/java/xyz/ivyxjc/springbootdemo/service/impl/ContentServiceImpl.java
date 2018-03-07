package xyz.ivyxjc.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ivyxjc.springbootdemo.dao.ContentDao;
import xyz.ivyxjc.springbootdemo.model.Content;
import xyz.ivyxjc.springbootdemo.service.IContentServcie;

import java.util.List;


@Service
public class ContentServiceImpl implements IContentServcie {

    @Autowired
    private ContentDao mContentDao;

    @Override
    public List<Content> getContents() {
        return mContentDao.findContentList();
    }
}
