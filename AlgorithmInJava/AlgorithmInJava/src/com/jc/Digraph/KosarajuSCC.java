package com.jc.Digraph;

/**
 * Created by xgh on 2016/2/3.
 */
//Kosaraju算法
    /*
    1.使用DepthFirstOrder求出G的反向图G.reverse()的逆后序排列
    2.对G按照该逆后序排列的顺序进行深度优先搜索
    3.在构造函数中，每一个同一dfs(v)所访问的顶点都在同一个强联通分量内
     */
public class KosarajuSCC {
    private boolean[] marked;
    private int[] id;
    private int count=0;
    private Digraph G;

    public KosarajuSCC(Digraph G){
        this.G=G;
        marked=new boolean[G.V()];
        id=new int[G.V()];
        /*
        G.reverse()返回的为G的反向图
        reversePostOrder是
         */
        DepthFirstOrder order=new DepthFirstOrder(G.reverse());
        for(int i:order.reversePost()){
            if(!marked[i]){
                dfs(i);
                count++;
            }

        }
    }


    public void dfs(int v){
        marked[v]=true;
        id[v]=count;
        for(int i:G.adj(v)){
            if(!marked[i]){
                dfs(i);
            }
        }
    }

    public boolean stronglyConnected(int v,int w){
        return (id[v]==id[w]);
    }

    public int id(int v){
        return id[v];
    }

    public int count(){
        return count;

    }
}
