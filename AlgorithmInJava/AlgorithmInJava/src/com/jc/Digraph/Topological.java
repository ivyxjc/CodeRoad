package com.jc.Digraph;

/**
 * Created by xgh on 2016/2/3.
 */
//一副有向无环图的拓扑排序就是所有顶点的逆后序排列
public class Topological {
    private Iterable<Integer> order;

    public Topological(Digraph G){
        DirectedCycle directedCycle = new DirectedCycle(G);
        DirectedCycle cyclefinder= directedCycle;
        if(!cyclefinder.hasCycle()){
            DepthFirstOrder dfs=new DepthFirstOrder(G);
            order=dfs.reversePost();
        }
    }

    public Iterable<Integer> order(){
        return order;
    }

    public boolean isDAG(){
        return order!=null;
    }
}
