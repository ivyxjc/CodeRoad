package serializable_practice;

import java.io.Serializable;

/**
 * Created by jc on 11/30/2016.
 */
public class Model implements Serializable{
    private String title;
    private String url;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String res="title: "+title+" url: "+url+" content: "+content;
        return res;
    }
}
