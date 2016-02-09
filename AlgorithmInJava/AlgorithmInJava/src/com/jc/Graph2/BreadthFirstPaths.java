package com.jc.Graph2;

import com.jc.Graph2.SymbolGraph.SymbolGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by xgh on 2016/1/29.
 */
public class BreadthFirstPaths {
    private boolean[] markedArray;
    private int[] edgeTo;//从起点到一个顶点的已知路径上的最后一点
    private final int s;//起点
    private Graph G;

    public BreadthFirstPaths(Graph G,int s){
        this.G=G;
        this.s=s;
        markedArray=new boolean[G.V()];
        edgeTo=new int[G.V()];
    }


    private void bfs(int s){
        Queue<Integer> queue=new LinkedList<>();
        markedArray[s]=true;
        queue.offer(s);
        while(!queue.isEmpty()){
            int v=queue.poll();
            for(int i:G.adj(v)){
                if(!markedArray[i]){
                    edgeTo[i]=v;
                    markedArray[i]=true;
                    queue.offer(i);
                }
            }
        }
    }

    public boolean hasPathTo(int v){
        return markedArray[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v))
            return null;
        Stack<Integer> path=new Stack<>();
        for(int x=v;x!=s;x=edgeTo[x]){
            path.push(x);
        }
        return path;
    }
}
