package com.jc.MinimumSpanningTree;

import java.util.*;

/**
 * Created by xgh on 2016/2/5.
 */
public class LazyPrimMST {
    private boolean[] marked;
    private Queue<Edge> mst;
    private PriorityQueue<Edge> pq;

    public LazyPrimMST(EdgeWeightedGraph G){
        pq=new PriorityQueue<>(Collections.reverseOrder());
        marked=new boolean[G.V()];

        mst=new LinkedList<>();
        visit(G,0);
        while(!pq.isEmpty()){
            Edge e=pq.poll();
            int v=e.either();
            int w=e.other(v);
            if(marked[v]&&marked[w])
                continue;
            mst.offer(e);

            if(!marked[v])
                visit(G,v);





            if(!marked[w])
                visit(G,w);
        }


    }

    private void visit(EdgeWeightedGraph G,int v){
        marked[v]=true;
        for(Edge e:G.adj(v)){
            if(!marked[e.other(v)])
                pq.offer(e);
        }
    }

    public Iterable<Edge> edges(){
        return mst;
    }

    public double weight(){
        //todo
        return 0.0;
    }
}
