package stone;

import stone.Exception.StoneException;

/**
 * Created by ivxyjc on 2016/11/20.
 */
public class Token {
    public static final Token EOF=new Token(-1){};
    public static final String EOL="\\n";
    public int lineNumber;

    public Token(int lines){
        lineNumber=lines;
    }

    public int getLineNumber(){
        return lineNumber;
    }

    public boolean isIdentifier(){
        return false;
    }

    public boolean isNumber(){
        return false;
    }

    public boolean isString(){
        return false;
    }

    public int getNumber(){
        throw new StoneException("not number token");
    }

    public String getText(){
        return "";
    }

}
