package com.jc.Searching;

import com.Princeton.lib.StdIn;
import com.Princeton.lib.StdOut;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jc on 11/26/2015.
 */
//递归版本
public class BST<Key extends Comparable<Key>,Value> {
    private Node root;

    private class Node{
        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        public Node(Key key,Value val,int N){
            this.key=key;
            this.val=val;
            this.N=N;
        }
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x==null)
            return 0;
        else
            return x.N;
    }

    public Value get(Key key){
        Node t=get(root,key);
        if(t==null)
            return null;
        else
            return t.val;
    }

    public Node get(Node x,Key key){
        if(x==null)
            return null;
        int cmp=key.compareTo(x.key);
        if(cmp<0)
            return get(x.left,key);
        else if(cmp>0)
            return get(x.right,key);
        else
            return x;
    }

    public void put(Key key,Value val){
        root=put(root,key,val);
    }

    private Node put(Node x,Key key,Value val){
        if(x==null)
            return new Node(key,val,1);
        int cmp=key.compareTo(x.key);
        if(cmp<0)
            x.left=put(x.left,key,val);
        else if(cmp>0)
            x.right=put(x.right,key,val);
        else
            x.val=val;
        x.N=size(x.left)+size(x.right)+1;
        return x;
    }

    public Key min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x.left==null){
            return x;
        }
        return min(x.left);
    }

    public Key max(){
        return max(root).key;
    }

    private Node max(Node x){
        if(x.right==null){
            return x;
        }
        return max(x.right);
    }

    public Key floor(Key key){
        Node x=floor(root,key);
        if(x==null)
            return null;
        return x.key;
    }

    private Node floor(Node x,Key key){//向下取整，小于等于Key的最大值
        if(x==null)
            return null;
        int cmp=key.compareTo(x.key);

        if(cmp==0)
            return x;
        else if(cmp<0)
            return floor(x.left,key);
        Node t=floor(x.right,key);
        if(t==null)
            return x;
        else{
            return t;
        }
    }

    public Key ceiling(Key key){
        Node t=ceiling(root,key);
        if(t==null)
            return null;
        else
            return t.key;
    }

    private Node ceiling(Node x, Key key){//向上取整，大于等于Key的最小值
        if(x==null)
            return null;
        int cmp=key.compareTo(x.key);
        if(cmp==0)
            return x;
        if(cmp>0)
            return floor(x.right,key);
        Node t=floor(x.left,key);
        if(t==null)
            return x;
        else
            return t;
    }

    public Key select(int k){
        Node t=select(root,k);
        if(t==null)
            return null;
        else
            return t.key;
    }

    private Node select(Node x,int k){
        //排名为k的键（即树中正好有k个小于它的键）
        if(k>=size(x)){
            return null;
        }
        if(x==null)
            return null;
        int t=size(x.left);
        if(t==k){
            return x;
        }
        else if(t<k)
            return select(x.right,k-t-1);
        else
            return select(x.left,k);
    }

    public void delete(){
        root=deleteMin(root);
    }

    private Node deleteMin(Node x){
        if(x.left==null)
            return x.right;
        x.left=deleteMin(x.left);
        x.N=size(x.left)+size(x.right)+1;
        return x;
    }

    public void deleteMax(){
        root=deleteMin(root);
    }

    private Node deleteMax(Node x){
        if(x.right==null){
            return x.left;
        }
        x.right=deleteMax(x.right);
        x.N=size(x.left)+size(x.right)+1;
        return x;
    }

    public void delete(Key key){
        root=delete(root,key);
    }

    private Node delete(Node x, Key key){
        if(x==null)
            return null;
        int cmp=key.compareTo(x.key);
        if(cmp<0)
            x.left=delete(x.left,key);
        else if(cmp>0)
            x.right=delete(x.right,key);
        else{
            if(x.left==null)
                return x.right;
            if(x.right==null)
                return x.left;
            Node t=x;
            x=min(t.right);
            x.right=deleteMin(t.right);
            x.left=t.left;
        }
        x.N=size(x.left)+size(x.right)+1;
        return x;
    }

    public Iterable<Key> keys(){
        return keys(min(),max());
    }

    public Iterable<Key> keys(Key lo, Key hi){
        Queue<Key> queue=new LinkedList<Key>();
        keys(root,queue,lo,hi);
        return queue;
    }

    private void keys(Node x, Queue<Key> queue,Key lo, Key hi){
        if(x==null)
            return ;
        int cmplo=lo.compareTo(x.key);
        int cmphi=hi.compareTo(x.key);
        if(cmplo<0)
            keys(x.left,queue,lo,hi);
        if(cmplo<=0 && cmphi>=0)
            queue.add(x.key);
        if(cmphi>0)
            keys(x.right,queue,lo,hi);
    }

    public void print(Node x){
        if(x==null)
            return ;
        print(x.left);
        StdOut.println(x.key);
        print(x.right);
    }

    public static void main(String[] args){
//        BST<String, Integer> st = new BST<String, Integer>();
//        String [] keys={"a","b","c","d","e","f","a","b"};
//        for (int i = 0; i<keys.length; i++) {
//            st.put(keys[i], i);
//        }
//        st.put("a",2);
//        System.out.println(st.get("a"));
        BST<Integer, Integer> st = new BST<Integer, Integer>();
        Integer [] keys={1,2,3,4,5,6,7,8,9,1,2,3};
        for (int i = 0; i<keys.length; i++) {
            st.put(keys[i], i);
        }
        st.put(1,2);
        //System.out.println(st.get(2));
        st.print(st.root);
    }
}




