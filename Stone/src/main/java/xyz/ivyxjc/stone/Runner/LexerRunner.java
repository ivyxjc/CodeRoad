package xyz.ivyxjc.stone.Runner;

import xyz.ivyxjc.stone.CodeDialog;
import xyz.ivyxjc.stone.Lexer;
import xyz.ivyxjc.stone.Token;
import xyz.ivyxjc.stone.exception.ParseException;

public class LexerRunner {
    public static void main(String[] args) throws ParseException{
        Lexer l=new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; ) {
            System.out.println("=> "+t.getText());
        }
    }
}
