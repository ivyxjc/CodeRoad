package com.jc.Digraph;

import com.jc.Graph.Bag;

/**
 * Created by xgh on 2016/2/3.
 */
//有向图
public class Digraph {
    private int V;//点数
    private int E;//边数
    private Bag<Integer>[] adj;

    public Digraph(int V){
        this.V=V;
        adj=(Bag<Integer>[])new Bag[V];
        for(int i=0;i<V;i++){
            adj[i]=new Bag<Integer>();
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v,int w){
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public Digraph reverse(){
        Digraph R=new Digraph(V);
        for(int i=0;i<V;i++){
            for(int j:adj[i]){
                R.addEdge(j,i);
            }
        }
        return R;

    }

}





