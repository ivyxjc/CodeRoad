package stone.Runner;

import stone.CodeDialog;
import stone.Exception.ParseException;
import stone.Lexer;
import stone.Token;

/**
 * Created by ivxyjc on 2016/11/22.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException{
        Lexer l=new Lexer(new CodeDialog());
        for(Token t;(t=l.read())!= Token.EOF;){
            System.out.println("=> "+t.getText());
        }
    }

}
