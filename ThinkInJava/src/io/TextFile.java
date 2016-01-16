package io;

import javax.xml.soap.Text;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jc on 11/25/2015.
 */
public class TextFile extends ArrayList<String> {

    //read a file as a single string
    public static String read(String filename){
        StringBuilder sb=new StringBuilder();

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(new File(filename).getAbsoluteFile())
            );
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public static void write(String fileName,String text){
        try{
            PrintWriter out=new PrintWriter(
                    new File(fileName).getAbsoluteFile()
            );
            try{
                out.print(text);
            }finally {
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public TextFile(String filename,String splitter){
        super(Arrays.asList(read(filename).split(splitter)));
        if(get(0).equals(""))
            remove(0);
    }

    public TextFile(String filename){
        this(filename ,"\n");
    }

    public void write(String filename){
        try{
            PrintWriter out=new PrintWriter(
                    new File(filename).getAbsoluteFile()
            );
            try{
                for(String item:this){
                    out.println(item);
                }
            }finally {
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        String local_env="E:\\program\\java\\ThinkInJava\\src\\io\\";
        String file=read(local_env+"TextFile.java");
        write(local_env+"test.txt",file);
        TextFile text=new TextFile(local_env+"test.txt");
        text.write(local_env+"test2.txt");
    }

}
