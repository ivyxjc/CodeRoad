package com.jc.Graph2;

/**
 * Created by xgh on 2016/2/2.
 */
//检查G是否是无环图（假设不存在自环或平行边）
public class Cycle {
    private boolean[] marked;
    private boolean hasCycle;

    public Cycle(Graph G){
        marked=new boolean[G.V()];
        for(int i=0;i<G.V();i++){
            if(!marked[i]){
                dfs(G,i,i);
            }
        }
    }

    private void dfs(Graph G,int v,int u){
        marked[v]=true;
        for(int w:G.adj(v)){
            if(!marked[w])
                dfs(G,w,v);
            else if(w!=u)
                hasCycle=true;
        }
    }

    public boolean hasCycle(){
        return hasCycle;
    }
}

