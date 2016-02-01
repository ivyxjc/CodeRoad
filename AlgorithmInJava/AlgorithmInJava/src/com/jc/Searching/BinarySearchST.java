package com.jc.Searching;

/**
 * Created by jc on 11/20/2015.
 */
public class BinarySearchST<Key extends Comparable<Key>,Value>{

    private Key[] keys;
    private Value[] vals;
    private int N;

    public BinarySearchST(int capacity){
        keys=(Key[])new Comparable[capacity];
        vals=(Value[])new Comparable[capacity];
    }



    public int size() {
        return N;
    }


    public Value get(Key key) {
        if(isEmpty())
            return null;
        int i=rank(key);
        if(i<N&&keys[i].compareTo(key)==0){
            return vals[i];
        }
        else
            return null;
    }


//return 比较次数
    public int put(Key key, Value val) {
        int count=0;
        int i=rank(key);
        if(i<N&&keys[i].compareTo(key)==0){
            count++;
            vals[i]=val;
            return count;
        }
        for(int j=N;j>i;j--){
            keys[j]=keys[j-1];
            vals[j]=vals[j-1];
        }
        keys[i]=key;
        vals[i]=val;
        N++;
        return count;
    }


    public void delete(Key key) {

    }

    public int rank(Key key){//迭代版本

        int lo=0;
        int hi=N-1;

        while(lo<hi){
            int mid=(hi+lo)/2;
            int cmp=key.compareTo(keys[mid]);
            if(cmp<0)
                hi=mid;
            else if(cmp>0)
                lo=mid+1;
            else
                return mid;
        }
        return -1;
    }

    public int rank(Key key,int lo, int hi){//递归版本
        if(hi<=lo)
            return lo;

        int mid=(lo+hi)/2;

        int cmp=key.compareTo(keys[mid]);

        if(cmp<0){
            return rank(key,lo,mid);
        }
        else if(cmp>0){
            return rank(key,mid+1,hi);
        }
        else
            return mid;
    }


    public Key min() {
        return keys[0];
    }

    public Key max() {
        return keys[N-1];
    }

    public boolean isEmpty(){
        return (N==0?true:false);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public Key floor(Key key){
        //todo
        return key;
    }

}
