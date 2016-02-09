package com.jc.Digraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by xgh on 2016/2/3.
 */
public class DepthFirstOrder {
    private Digraph G;

    private boolean[] marked;

    private Queue<Integer> pre;
    private Queue<Integer> post;
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph G){
        this.G=G;
        pre=new LinkedList<>();
        post=new LinkedList<>();
        reversePost=new Stack<>();

        marked=new boolean[G.V()];
        for(int i=0;i<G.V();i++){
            if(!marked[i])
                dfs(i);
        }
    }




    private void dfs(int v){
        pre.offer(v);
        marked[v]=true;
        for(int i:G.adj(v)){
            if(!marked[i]){
                dfs(i);
            }
        }
        post.offer(v);
        reversePost.push(v);
    }

    public Iterable<Integer> pre(){
        return pre;
    }

    public Iterable<Integer> post(){
        return post;
    }

    public Iterable<Integer> reversePost(){
        return reversePost;
    }
}
