package com.jc.Graph;

import java.util.Iterator;

/**
 * Created by jc on 12/2/2015.
 */
public class Search {

    private  Graph G;
    private  int s;


    public Search(Graph G, int s){
        this.G=G;
        this.s=s;
    }

    public boolean marked(int v){
        for(int w:G.adj(s)){
            if(w==v){
                return true;
            }
        }
        return false;
    }

    public int count(){
        int count=0;
        for(int w:G.adj(s)){
            count++;
        }
        return  count;
    }



}
