package io;

import java.io.*;

/**
 * Created by jc on 11/22/2015.
 */
public class BasicFileOut {

    static String file = "E:\\program\\java\\ThinkInJava\\src\\io\\BasicFileOut.out";
    static String local_env = "E:\\program\\java\\ThinkInJava\\src\\io\\";

    public static void main(String[] args)
            throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read(local_env + "BasicFileOut.java")
                )
        );

        PrintWriter  out=new PrintWriter(
            new BufferedWriter(new FileWriter(file))
        );

//        PrintWriter out=new PrintWriter(new FileWriter(file));

        int lineCount=1;
        String s;

        while((s=in.readLine())!=null){
            out.println(lineCount++ +": "+s);
        }
        out.close();

        System.out.println(BufferedInputFile.read(file));








    }
}
