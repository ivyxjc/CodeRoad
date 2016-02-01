package com.jc.Graph;

import com.Princeton.lib.In;
import com.sun.prism.GraphicsPipeline;

/**
 * Created by jc on 12/1/2015.
 */
public class Graph {
    private final int V; //顶点数目
    private int E;      //边的数目
    private Bag<Integer>[] adj;

    public Graph(int V){
        this.V=V;
        adj=(Bag<Integer>[])new Bag[V];
        for(int i=0;i<V;i++){
            adj[i]=new Bag<Integer>();
        }
    }

    public Graph(In in){
        this(in.readInt());
        int E=in.readInt();
        for(int i=0;i<E;i++){
            int v=in.readInt();
            int w=in.readInt();
            addEdge(v,w);
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
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }



/*
Graph的一些图处理代码
 */

    //计算v的度数
    public static int degree(Graph G, int v){
        int degree=0;
        for(int w:G.adj[v])
            degree++;
        return degree;
    }

    //计算所有顶点的最大度数
    public static int maxDegree(Graph G){
        int max=0;
        for(int i=0;i<G.V();i++){
            int tmp=degree(G,i);
            if(tmp>max)
                max=tmp;
        }
        return max;
    }

    //所有顶点的平均度数
    public static double avgDegree(Graph G){
        return 2.0*G.E()/G.V();
    }


    //计算自环的个数
    public static int numberOfSelfLoops(Graph G){
        int count=0;

        for(int i=0;i<G.V();i++){
            for(int j:G.adj(i)){
                if(i==j)
                    count++;
            }
        }
        return count/2;
    }

    //图的邻接表的字符串表示
    public String toString(){
        String s=V+" vertices, "+E+" edges\n";
        for(int v=0;v<V;v++){
            s+=v+": ";
            for(int w:this.adj(v)){
                s+=w+" ";
            }
            s+="\n";
        }
        return s;
    }



}
