package com.jc.Graph2;

/**
 * Created by xgh on 2016/1/29.
 */
public class DepthFirstSearch {

    private boolean[] markedArray;
    private int count;
    private Graph G;

    public DepthFirstSearch(Graph G,int s){
        this.G=G;
        markedArray=new boolean[G.V()];
        dfs(s);

    }

    //一个连通分量内dfs
    private void dfs(int v) {
        markedArray[v]=true;
        count++;
        for(int w:G.adj(v)){
            if(!markedArray[w])
                dfs(w);
        }
    }

    public boolean marked(int w){
        return markedArray[w];
    }

    public int getCount(){
        return count;
    }
}

//
//for(int i=0;i<G.V();i++){
//        if(!markedArray[i]){
//        dfs(G,i);
//        }
//        }