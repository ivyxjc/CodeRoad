package com.jc.Searching;

import com.Princeton.lib.In;
import com.Princeton.lib.StdIn;
import com.Princeton.lib.StdOut;

/**
 * Created by jc on 12/1/2015.
 */
public class LookupCSV {
    public static void main(String[] args){
        In in=new In(args[0]);
        int keyField=Integer.parseInt(args[1]);
        int valField=Integer.parseInt(args[2]);
        RedBlackBST<String,String> st=new RedBlackBST<String,String>();
        //RBST<String,String> st=new RBST<String,String>();
        while(in.hasNextLine())
        {
            String line=in.readLine();
            String[] tokens=line.split(",");
            String key=tokens[keyField];
            String val=tokens[valField];
            st.put(key,val);
        }
        //StdOut.println(st.get("202.13.13.133"));


    }
}
