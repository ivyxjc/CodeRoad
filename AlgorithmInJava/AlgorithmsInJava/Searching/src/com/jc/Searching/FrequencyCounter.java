package com.jc.Searching;

import  com.Princeton.lib.*;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
/**
 * Created by jc on 11/20/2015.
 */
import java.io.*;

/**
 * Created by jc on 11/20/2015.
 */
public class FrequencyCounter {

    static String data_path="E:\\program\\java\\AlgorithmInJava\\AlgorithmsInJava\\algs4-data\\";

    public static void main(String[] args)
    throws IOException{
        //VisualAccumulator visualAccumulator=new VisualAccumulator(15000,6000);
        int minlen=Integer.parseInt(args[0]);//


        //SequentialSearchST<String,Integer> st=new SequentialSearchST<>();

        RedBlackBST<String,Integer> st=new RedBlackBST<>();
        //BinarySearchST<String,Integer> st=new BinarySearchST<>(200000);
        String filename="tale.txt";
        BufferedReader in = new BufferedReader(new FileReader(data_path+filename));

        String sentence;

        StringBuilder sb = new StringBuilder();
        while((sentence=in.readLine())!=null){
            String[] words=sentence.split(" ");
            for(String word:words) {
                //System.out.println(word);
                if (word.length() < minlen)
                    continue;
                if (!st.contains(word)) {
                    st.put(word,1);
                    //int tmp=st.put(word, 1);
                    //visualAccumulator.addDataValue(tmp);
                }
                else {
                    st.put(word,1);
                    //int tmp=st.put(word, st.get(word) + 1);
                    //visualAccumulator.addDataValue(tmp);
                }
            }
        }

        String max=" ";

//        st.put(max,0);
//        for(String s:st.keys()){
//            if(st.get(s)>st.get(max))
//                max=s;
//        }

        StdOut.println(max+ " "+st.getMax());
    }









}

