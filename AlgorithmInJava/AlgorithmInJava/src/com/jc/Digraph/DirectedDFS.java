package com.jc.Digraph;

/**
 * Created by xgh on 2016/2/3.
 */
public class DirectedDFS {

    private Digraph G;
    private boolean[] marked;
    private int start;//起点

    public DirectedDFS(Digraph G,int s){
        this.G=G;
        start=s;
        marked=new boolean[G.V()];
        dfs(s);
    }

    public DirectedDFS(Digraph G, Iterable<Integer> sources){
        this.G=G;
        marked=new boolean[G.V()];
        for(int i:sources){
            dfs(i);
        }
    }

    public boolean marked(int v){
        return marked[v];
    }

    public void dfs(int s){
        marked[s]=true;
        for(int i:G.adj(s)){
            if(!marked(i)){
                dfs(i);
            }
        }
    }

}
