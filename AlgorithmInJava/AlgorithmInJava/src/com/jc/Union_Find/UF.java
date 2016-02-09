package com.jc.Union_Find;

/**
 * Created by xgh on 2016/2/2.
 */
public class UF {
    private int[] id;
    private int count;

    public UF(int N){
        count=N;
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }

    //quick_find的算法，find时间O1，但是union时间O N
    public int find(int p){
        return id[p];
    }

    public void union(int p,int q){
        int pID=id[p];
        int qID=id[q];
        if(pID==qID)
            return;

        for(int i=0;i<id.length;i++){
            if(id[i]==pID){
                id[i]=qID;
            }
        }
        count--;
    }

    public boolean connected(int p,int q){
        if(id[p]==id[q]){
            return true;
        }
        else
            return false;
    }

    //quick_union的方法,find O 树的高度  最差 O N,union 树的高度
    public int find(int p,int t){
        while(p!=id[p]){
            p=id[p];
        }
        return p;
    }

    public void union(int p,int q,int t){
        int pRoot=find(p,1);
        int qRoot=find(q,1);
        if(pRoot==qRoot)
            return;

        id[pRoot]=qRoot;
        count--;
    }

    public boolean connected(int p,int q,int t){
        if(find(p,1)==find(q,1))
            return true;
        return false;
    }


    public int count(){
        return count;
    }



}
