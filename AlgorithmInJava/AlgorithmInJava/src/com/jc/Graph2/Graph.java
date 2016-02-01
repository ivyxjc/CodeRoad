package com.jc.Graph2;

import com.Princeton.lib.In;
import com.jc.Graph.Bag;

/**
 * Created by xgh on 2016/1/29.
 */
public class Graph {
    //该图不可以增加顶点数
    private final int V;//顶点数
    private int E;//边数
    private Bag<Integer>[] adj;

    private boolean[] marked;//深度优先搜索时使用
    private int count;

    public Graph(int V){
        this.V=V;
        this.E=0;
        adj=new Bag[V];
        for(int i=0;i<V;i++){
            adj[i]=new Bag<Integer>();
        }

        marked=new boolean[V];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v,int w){
        if(v>=V || w>=V)
            return;
        if(v<0||w<0)
            return;
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

    //计算v的度数
    public  int degree(int v){
        return degree(this,v);
    }


    //计算所有顶点的最大度数
    public int maxDegree(){
        return maxDegree(this);
    }

    //计算自环个数
    public int numberOfSelfLoop(){
        return numberOfSelfLoop(this);
    }


    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        s.append(V+" vertices, "+E+" edges\n");
        for(int i=0;i<V;i++){
            s.append(i+" : ");
            for(int w:this.adj[i]){
                s.append(w+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }






    /*
    以下皆是静态方法
     */
    //计算v的度数
    public static int degree(Graph G,int v){
        int degree=0;
        for(int w:G.adj(v)){
            degree++;
        }
        return degree;
    }

    //计算所有顶点的最大度数
    public static int maxDegree(Graph G){
        int max=0;
        for(int i=0;i<G.V();i++){
            max=(max>=degree(G,i)?max:degree(G,i));
        }
        return max;
    }

    //计算自环个数
    public static int numberOfSelfLoop(Graph G){
        int nslCount=0;
        for(int i=0;i<G.V();i++){
            for(int k:G.adj(i)){
                if(k==i){
                    nslCount++;
                }
            }
        }
        return nslCount/2;
    }

    //计算平均度数
    public static double avgDegree(Graph G){
        return 2.0*G.E()/G.V();
    }



}
