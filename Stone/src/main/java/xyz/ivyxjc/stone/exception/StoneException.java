package xyz.ivyxjc.stone.exception;

import xyz.ivyxjc.ast.ASTree;

/**
 * Created by ivxyjc on 2016/11/20.
 */
public class StoneException extends RuntimeException {
    public StoneException(String m) {
        super(m);
    }


    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }

}
