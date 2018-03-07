package xyz.ivyxjc.springbootdemo.web;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.ivyxjc.springbootdemo.model.Content;
import xyz.ivyxjc.springbootdemo.service.IContentServcie;

import java.util.List;

@Api
@RestController
public class ContentController {

    @Autowired
    private IContentServcie mContentServcie;

    @RequestMapping(value = "/contents", method = RequestMethod.GET)
    public List<Content> getContents() {
        return mContentServcie.getContents();
    }

}
