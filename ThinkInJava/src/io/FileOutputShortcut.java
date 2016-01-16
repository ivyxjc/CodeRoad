package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * Created by jc on 11/22/2015.
 */
public class FileOutputShortcut {

    static String file = "E:\\program\\java\\ThinkInJava\\src\\io\\FileOutputShortcut.out";
    static String local_env = "E:\\program\\java\\ThinkInJava\\src\\io\\";

    public static void main(String[] args)
        throws IOException{

        BufferedReader in=new BufferedReader(new StringReader(
                BufferedInputFile.read(local_env+"FileOutputShortcut.java")
        ));

        PrintWriter out=new PrintWriter(file);

        int lineCounter=1;
        String s;

        while((s=in.readLine())!=null){
            out.println(lineCounter++ +": "+s);
        }

        out.close();

        System.out.println(BufferedInputFile.read(file));


    }
}
