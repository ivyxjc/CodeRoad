package stone;

/**
 * Created by ivxyjc on 2016/11/20.
 */

import stone.Exception.ParseException;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * 词法分析器
 */
public class Lexer {
    public static String regexPat = "";

    public Pattern pattern=Pattern.compile(regexPat);

    public ArrayList<Token> queue=new ArrayList<>();
    private boolean hasMore;
    private LineNumberReader reader;

    public Lexer(Reader r){
        hasMore=true;
        reader=new LineNumberReader(r);
    }

    public Token read() throws ParseException {
        if(fillQueue(0)){
            return queue.remove(0);
        }else{
            return Token.EOF;
        }
    }

    private boolean fillQueue(int i) throws ParseException{
        while(i>=queue.size()){
            if(hasMore){
                readLine();
            }else{
                return false;
            }
        }
        return true;
    }

    private void readLine() throws ParseException{
        String line;
        try{
            line=reader.readLine();
        }catch (IOException e){
            throw new ParseException(e);
        }

        if(line==null){
            hasMore=false;
            return;
        }

        int lineNo=reader.getLineNumber();


    }

}
