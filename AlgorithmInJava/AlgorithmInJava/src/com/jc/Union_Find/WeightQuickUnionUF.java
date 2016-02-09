package com.jc.Union_Find;

/**
 * Created by xgh on 2016/2/2.
 */
public class WeightQuickUnionUF {
    private int [] id;
    private int[] sz;
    private int count;
    public WeightQuickUnionUF(int N){
        count=N;
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
        sz=new int[N];
        for (int i:sz){
            i=1;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    //find  O log N, union O log N
    public int find(int p){
        while (p!=id[p]){
            p=id[p];
        }
        return p;
    }

    public void union(int p,int q){
        int pRoot=find(p);
        int qRoot=find(q);
        if(pRoot==qRoot){
            return;
        }

        if(sz[pRoot]<sz[qRoot]){
            id[pRoot]=qRoot;
            sz[qRoot]+=sz[pRoot];
        }
        else{
            id[qRoot]=pRoot;
            sz[pRoot]+=sz[qRoot];
        }

        count--;
    }

}
