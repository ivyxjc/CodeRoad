package xyz.ivyxjc.beans.io;

import java.net.URL;

/**
 * Created by ivxyjc on 2017/1/6.
 */
public class ResourceLoader {
    public Resource getResource(String location){
        URL url=this.getClass().getClassLoader().getResource(location);
        return new UrlResource(url);
    }
}
