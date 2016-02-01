package com.jc.Graph2;

import java.util.Stack;

/**
 * Created by xgh on 2016/1/29.
 */
public class DepthFirstPaths {
    private boolean[] markedArray;
    private int[] edgeTo;//从起点到一个顶点的已知路径上的最后一点
    private final int s;//起点
    private Graph G;

    public DepthFirstPaths(Graph G,int s){
        this.G=G;
        markedArray=new boolean[G.V()];
        edgeTo=new int[G.V()];
        this.s=s;
        dfs(s);
    }

    private void dfs(int v){
        markedArray[v]=true;
        for(int w:G.adj(v)){
            if(!markedArray[w]){
                edgeTo[w]=v;
                dfs(w);
            }
        }
    }

    public boolean haspathTo(int v){
        return markedArray[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!haspathTo(v))
            return null;
        Stack<Integer> path=new Stack<>();
        for(int x=v;x!=s;x=edgeTo[x]) {
            path.push(x);
        }
        return path;
    }

}
