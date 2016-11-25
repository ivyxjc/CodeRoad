package stone.runner;

import stone.CodeDialog;
import stone.Lexer;
import stone.Token;
import stone.exception.ParseException;

/**
 * Created by jc on 11/21/2016.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException{
        Lexer l=new Lexer(new CodeDialog());
        for (Token t;(t=l.read())!=Token.EOF;){
            System.out.println("=> "+t.getText());
        }
    }
}
