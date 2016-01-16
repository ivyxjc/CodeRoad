package strings;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jc on 11/7/2015.
 */
public class InfiniteRecursion {

    public String toString(){
        return "InfiniteRecursion address: "+super.toString()+"\n";
    }
    public static void main(String[] args){
        List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
        for(int i=0;i<10;i++){
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
        InfiniteRecursion a=new InfiniteRecursion();
        System.out.println(a);
    }
}
