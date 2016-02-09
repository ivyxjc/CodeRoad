package com.jc.MinimumSpanningTree;

import com.jc.Graph.Bag;

/**
 * Created by xgh on 2016/2/4.
 */
public class EdgeWeightedGraph {

    private final int V;
    private int E;
    private Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V){
        this.V=V;
        this.E=0;


        adj=(Bag<Edge>[])new Bag[V];
        for(int i=0;i<V;i++){
            adj[i]=new Bag<Edge>();
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(Edge e){
        int i=e.either();
        int j=e.other(i);
        adj[i].add(e);
        adj[j].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }

    public Iterable<Edge> edges(){
        Bag<Edge> b=new Bag<Edge>();
        for(int i=0;i<V;i++){
            for(Edge e:adj[i]){
                if(e.other(i)>i)
                    b.add(e);
            }
        }
        return b;
    }
}
