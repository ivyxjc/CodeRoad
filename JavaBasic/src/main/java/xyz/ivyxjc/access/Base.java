package xyz.ivyxjc.access;

/**
 * Created by ivxyjc on 2017/1/12.
 */
public class Base {
    private Base() {

    }

    public Base(String s) {

    }
//    public
}


class Son extends Base {
    public Son(String s) {
        //super(); 编译错误,
        super(s);
    }
}