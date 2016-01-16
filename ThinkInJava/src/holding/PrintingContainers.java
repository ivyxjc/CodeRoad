package holding;

import java.util.*;

/**
 * Created by jc on 11/8/2015.
 */
public class PrintingContainers {
    static Collection fill(Collection<String> colleciton){
        colleciton.add("rat");
        colleciton.add("cat");
        colleciton.add("dog");
        colleciton.add("dog");
        return colleciton;
    }

    static Map fill(Map<String,String>map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

    public static void main(String[] args){
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));

        System.out.println(fill(new HashMap<String, String>()));
    }
}
