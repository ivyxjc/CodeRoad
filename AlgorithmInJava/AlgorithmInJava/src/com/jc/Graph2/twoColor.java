package com.jc.Graph2;

/**
 * Created by xgh on 2016/2/2.
 */
//判断一个图是否是二分图（二色问题），能否用两种颜色将所有顶点着色，使得任意一条边的两个端点的颜色都不相同。
public class twoColor {
    private boolean[] marked;
    private boolean[] color;
    private boolean isTwoColorable=true;

    public twoColor(Graph G){
        marked=new boolean[G.V()];
        color=new boolean[G.V()];
        for(int i=0;i<G.V();i++){
            if(!marked[i]){
                dfs(G,i);
            }
        }
    }

    private void dfs(Graph G,int v){
        marked[v]=true;
        for(int w:G.adj(v)){
            if(!marked[w]){
                color[w]=!color[v];
                dfs(G,w);
            }
            else if(color[w]==color[v]){
                isTwoColorable=false;
            }

        }
    }

    public boolean isBiartite(){
        return isTwoColorable;
    }

}
