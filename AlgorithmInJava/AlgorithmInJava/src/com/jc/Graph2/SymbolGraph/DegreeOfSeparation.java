package com.jc.Graph2.SymbolGraph;

import com.Princeton.lib.StdIn;
import com.jc.Graph2.BreadthFirstPaths;
import com.jc.Graph2.Graph;

/**
 * Created by xgh on 2016/2/2.
 */
public class DegreeOfSeparation {
    private SymbolGraph sg;
    private Graph G;

    public DegreeOfSeparation(String filename,String delim){
        sg=new SymbolGraph(filename,delim);
        G=sg.G();
    }

    public String ConnectingPath(int key_index,int target_key_index){
        StringBuilder res=new StringBuilder();
        sg.name(key_index);
        if(!sg.contains(key_index)){
            return key_index+" is out of the biggest index";
        }
        if(!sg.contains(target_key_index)){
            return target_key_index+" is out of the biggest index";
        }

        String key=sg.name(key_index);
        System.out.println(key);
        String target_key=sg.name(target_key_index);
        System.out.println(target_key);


        BreadthFirstPaths bfs=new BreadthFirstPaths(G,key_index);
        System.out.println(bfs.hasPathTo(target_key_index));

        if(bfs.hasPathTo(target_key_index)){
            for(int i:bfs.pathTo(target_key_index)){
                res.append("   "+sg.name(i)+"\n");
            }
        }
        else{
            res.append(target_key+" is not connected to "+key);
        }
        return res.toString();
    }
    public String ConnectingPath(String key,String target_key){
        int key_index=sg.index(key);
        int target_key_index=sg.index(target_key);
        return ConnectingPath(key_index,target_key_index);
    }
}
