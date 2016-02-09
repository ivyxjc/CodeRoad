package com.jc.Digraph;

import com.jc.Graph2.Graph;

import java.util.List;
import java.util.Stack;

/**
 * Created by xgh on 2016/2/3.
 */
public class KosarajuAlgorithm {
    private boolean[] marked;
    private int[] id;
    private int count=0;
    private Stack<Integer> reversePostOrder;
    public KosarajuAlgorithm(Digraph G){
        //G.V()返回有向图G的边数
        marked=new boolean[G.V()];
        id=new int[G.V()];
        //G.reverse()返回的为G的反向图
        Digraph G_reverse=G.reverse();
        //本遍循环是将G的反向图的逆后序排列存储在reversePostOrder中
        for(int i=0;i<G_reverse.V();i++){
            if(!marked[i]){
                dfs(G_reverse,i);
            }
        }
        //按照G的反向图的逆后排序进行深度优先搜索
        for(int i:reversePostOrder){
            if(!marked[i]){
                dfs(G,i);
                count++;
            }
        }
    }
    //深度优先搜索
    public void dfs(Digraph G,int v){
        marked[v]=true;
        id[v]=count;
        for(int i:G.adj(v)){
            if(!marked[i]){
                dfs(G,i);
            }
        }
        reversePostOrder.push(v);
    }

}

