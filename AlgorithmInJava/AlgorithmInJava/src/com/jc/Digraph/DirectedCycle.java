package com.jc.Digraph;

import java.util.Stack;

/**
 * Created by xgh on 2016/2/3.
 */
public class DirectedCycle {
    private Digraph G;
    public boolean[] marked;
    private int [] edgeTo;
    private Stack<Integer> cycle;
    private boolean[] onStack;

    public DirectedCycle(Digraph G){
        this.G=G;
        onStack=new boolean[G.V()];
        marked=new boolean[G.V()];
        edgeTo=new int[G.V()];
        for(int i=0;i<G.V();i++){
            if(!marked[i]){
                dfs(i);
            }
        }
    }

    public boolean hasCycle(){
        return cycle!=null;
    }

    public Iterable<Integer> cycle(){
        return cycle;
    }

    private void dfs(int v){
        onStack[v]=true;
        marked[v]=true;
        for(int i:G.adj(v)){
            if(this.hasCycle())
                return;
            else if(!marked[i]){
                edgeTo[i]=v;
                dfs(i);
            }
            else if(onStack[i]){
                cycle=new Stack<>();
                for(int x=v;x!=i;x=edgeTo[x]){
                    cycle.push(x);
                }
                cycle.push(i);
                cycle.push(v);
            }
        }
        onStack[v]=false;
    }
}
