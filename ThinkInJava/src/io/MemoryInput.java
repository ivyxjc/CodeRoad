package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by jc on 11/22/2015.
 */
public class MemoryInput {

    public static void main(String[] args)
        throws IOException{
        StringReader in=new StringReader(BufferedInputFile.read("E:\\program\\java\\AlgorithmInJava\\AlgorithmsInJava\\algs4-data\\tinyTale.txt"));

        int c;

        while((c=in.read())!=-1){
            System.out.println((char)c);
        }
    }
}
