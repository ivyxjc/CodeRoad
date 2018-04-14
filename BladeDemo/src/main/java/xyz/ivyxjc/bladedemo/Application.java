package xyz.ivyxjc.bladedemo;

import com.blade.Blade;

/**
 * @author Ivyxjc
 * @since 4/9/2018
 */
public class Application {
    public static void main(String[] args) {
        //Blade.me().start(Application.class,args);
        Blade.me()
            .get("/", (req, res) -> res.text("Hello World!"))
            .start(Application.class, args);
    }
}
