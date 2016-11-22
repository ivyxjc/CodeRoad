package stone;

/**
 * Created by ivxyjc on 2016/11/20.
 */

import stone.exception.ParseException;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 词法分析器
 */
public class Lexer {
    public static String regexPat
            = "\\s*((//.*)|([0-9]+)|(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")"
            + "|[A-Z_a-z][A-Z_a-z0-9]*|==|<=|>=|&&|\\|\\||\\p{Punct})?";

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
        int lineNo = reader.getLineNumber();
        Matcher matcher = pattern.matcher(line);
        matcher.useTransparentBounds(true).useAnchoringBounds(false);

        int pos = 0;
        int endPos = line.length();
        while (pos < endPos) {
            matcher.region(pos, endPos);
            if (matcher.lookingAt()) {
                addToken(lineNo, matcher);
                pos = matcher.end();
            }
            else
                throw new ParseException("bad token at line " + lineNo);
        }
        queue.add(new IdToken(lineNo, Token.EOL));

    }


    protected String toStringLiteral(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length() - 1;
        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            if (c == '\\' && i + 1 < len) {
                int c2 = s.charAt(i + 1);
                if (c2 == '"' || c2 == '\\')
                    c = s.charAt(++i);
                else if (c2 == 'n') {
                    ++i;
                    c = '\n';
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }


    /**
     * Pattern pattern=Pattern.compile("(([a-z]+)(\\d*))");
     * matcher.group(0)对应所有匹配到的字符串
     * matcher.group(1)对应最外面的括号所匹配到的字符串
     * matcher.group(2)对应([a-z]+)所匹配到的字符串
     * matcher.group(3)对应(\\d*)所匹配到的字符串
     * "\\s*((//.*)|([0-9]+)|(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")"
     * + "|[A-Z_a-z][A-Z_a-z0-9]*|==|<=|>=|&&|\\|\\||\\p{Punct})?";
     * @param lineNo
     * @param matcher
     */
    protected void addToken(int lineNo, Matcher matcher){
        String m=matcher.group(1);
        if(m!=null){ //说明该语句有内容
            if(matcher.group(2)==null){ //说明该语句不是 注释
                Token token;
                if(matcher.group(3)!=null){
                    token = new NumToken(lineNo,Integer.parseInt(m));
                }else if(matcher.group(4)!=null){
                    token=new StrToken(lineNo,m);
                }else {
                    token=new IdToken(lineNo,m);
                }
                queue.add(token);

            }
        }
    }


    static class NumToken extends Token{
        private int value;
        NumToken(int lines,int v) {
            super(lines);
            value=v;
        }

        @Override
        public boolean isNumber() {
            return true;
        }

        @Override
        public String getText() {
            return Integer.toString(value);
        }

        @Override
        public int getNumber() {
            return value;
        }
    }

    static class IdToken extends Token{
        private String text;

        IdToken(int line,String id){
            super(line);
            text=id;
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public boolean isIdentifier() {
            return true;
        }
    }

    static class StrToken extends Token{
        String str;
        public StrToken(int lines,String str) {
            super(lines);
            this.str=str;
        }

        @Override
        public String getText() {
            return str;
        }



        @Override
        public boolean isString() {
            return true;
        }
    }
}
