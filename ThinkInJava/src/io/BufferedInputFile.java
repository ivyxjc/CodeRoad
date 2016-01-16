package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by jc on 11/21/2015.
 */
public class BufferedInputFile {
    public static String read(String filename)throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));

        String s;

        StringBuilder sb = new StringBuilder();

        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }

        in.close();
        return sb.toString();
    }

    public static void printInversion(String filename)throws IOException{
        BufferedReader in=new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb=new StringBuilder();
        LinkedList<String> linkedList=new LinkedList<String>();

        while((s=in.readLine())!=null){
            linkedList.add(s);
        }

        in.close();

        for(int i=linkedList.size()-1;i>=0;i--){
            System.out.println(linkedList.get(i));
            
        }

    }

    public static void main(String[] args)
            throws IOException{
        //System.out.print(read("E:\\program\\java\\AlgorithmInJava\\AlgorithmsInJava\\algs4-data\\tinyTale.txt"));
        printInversion("E:\\program\\java\\AlgorithmInJava\\AlgorithmsInJava\\algs4-data\\tinyTale.txt");

   }



}
