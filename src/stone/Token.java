package stone;

import stone.exception.StoneException;

/**
 * Created by ivxyjc on 2016/11/20.
 */
public abstract class Token {
    public static final Token EOF=new Token(-1){
        @Override
        public String getText() {
            return "";
        }
    };
    public static final String EOL="\\n";
    public int lineNumber;

    public Token(int lines){
        lineNumber=lines;
    }

    public int getLineNumber(){
        return lineNumber;
    }

    /**
     * IdToken修改该方法, 返回True.
     * @return
     */
    public boolean isIdentifier(){
        return false;
    }

    /**
     * NumToken修改该方法, 返回True.
     * @return
     */
    public boolean isNumber(){
        return false;
    }

    /**
     * StrToken修改该方法, 返回True.
     * @return
     */
    public boolean isString(){
        return false;
    }

    public int getNumber(){
        throw new StoneException("not number token");
    }



    public abstract String getText();

}
