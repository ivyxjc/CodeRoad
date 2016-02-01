package com.jc.Graph2;

/**
 * Created by xgh on 2016/2/1.
 */
//连通分量
public class CC {
    private Graph G;
    private boolean[] marked;
    private int count;
    private int[] id;//记录某一点在哪一个连通分量中

    public CC(Graph G){
        this.G=G;
        marked=new boolean[G.V()];
        for(int i=0;i<G.V();i++){
            if(!marked[i]){
                dfs(i);
                count++;
            }
        }
    }

    private void dfs(int v){
        marked[v]=true;
        id[v]=count;
        for(int w:G.adj(v)){
            if(!marked[w]){
                dfs(w);
            }
        }
    }

    public boolean isConnected(int v,int w){
        return id[v]==id[w];
    }

    //连通分量数
    public int count(){
        return count;
    }

    public int id(int v){
        return id[v];
    }
}
