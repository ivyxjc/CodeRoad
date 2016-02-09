package com.jc.Graph2.SymbolGraph;

import com.jc.Graph2.Graph;
import com.jc.Searching.ST;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xgh on 2016/2/2.
 */
public class SymbolGraph {

    private ST<String,Integer> st;
    private String[] keys;
    private Graph G;

    /**
     *
     * @param filename
     * @param delim 使用delim来分隔顶点名
     */
    public SymbolGraph(String filename,String delim){
        st=new ST<>();
        try{
            FileInputStream fis=new FileInputStream(filename);
            Scanner in=new Scanner(fis);
            while (in.hasNextLine()){
                String[] aa=in.nextLine().split(delim);
                for(int i=0;i<aa.length;i++){
                    if(!st.contains(aa[i])){
                        st.put(aa[i],st.size());
                    }
                }
            }
            keys=new String[st.size()];

            for(String name:st.keys()){
                keys[st.get(name)]=name;
            }

            G=new Graph(st.size());

            in=new Scanner(fis);
            while (in.hasNextLine()){
                String[] aa=in.nextLine().split(delim);
                int v=st.get(aa[0]);
                for(int i=1;i<aa.length;i++){
                    G.addEdge(v,st.get(aa[i]));
                }
            }


            }catch (IOException e){
            e.printStackTrace();
        }


    }

    public boolean contains(String key){
        return st.contains(key);
    }

    public boolean contains(int key_index){
        if(key_index>=keys.length)
            return false;
        else
            return true;
    }

    public int index(String key){
        return st.get(key);
    }

    public String name(int v){
        return keys[v];
    }

    Graph G(){
        return G;
    }

}
