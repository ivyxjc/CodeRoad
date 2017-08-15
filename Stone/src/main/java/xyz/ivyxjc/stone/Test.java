package xyz.ivyxjc.stone;

import jdk.nashorn.internal.codegen.ClassEmitter;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jc on 11/21/2016.
 */
public class Test {
    public static void main(String[] args){
//        Pattern pattern= Pattern.compile("\\s*((//.*)|([0-9]+)|(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")"
//                + "|[A-Z_a-z][A-Z_a-z0-9]*|==|<=|>=|&&|\\|\\||\\p{Punct})?");

        Pattern pattern=Pattern.compile("(([a-z]+)(\\d*))");
        String str="as334_SDFdsf+";
        Matcher matcher=pattern.matcher(str);
        matcher.useTransparentBounds(true)
                .useAnchoringBounds(false);
        System.out.println(matcher.lookingAt());
        System.out.println(matcher);
        System.out.println(matcher.region(0,str.length()));
        System.out.println(matcher.lookingAt());

        System.out.println("-------");
        System.out.println(matcher.group(0));
        System.out.println(new Test().a());
        System.out.println();
    }

    public String a(){
        try{
            Class.forName(getClass().getName());
            System.out.print(getClass().getName());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return  "aa";
    }
}
