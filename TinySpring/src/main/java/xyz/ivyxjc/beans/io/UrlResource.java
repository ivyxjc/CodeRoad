package xyz.ivyxjc.beans.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by ivxyjc on 2017/1/6.
 */
public class UrlResource implements Resource{

    private URL url;

    public UrlResource(URL url){
        this.url=url;
    }


    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection=url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
