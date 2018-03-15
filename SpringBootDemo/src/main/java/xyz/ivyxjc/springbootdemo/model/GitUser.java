package xyz.ivyxjc.springbootdemo.model;

public class GitUser {
    private String username;
    private String blog;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "username: " + username + ", Blog: " + blog;
    }
}
