package holding;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

/**
 * Created by jc on 11/8/2015.
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));//1
        Integer [] moreInt={6,7,8,9};
        collection.addAll(Arrays.asList(moreInt));//runs faster than 1,but you can construct a Collection in this way

        Collections.addAll(collection,11,12,13,14);
        Collections.addAll(collection,moreInt);
        System.out.println(collection);

        List<Integer> list=Arrays.asList(16,17,18);
        list.set(1,99);//modify an element
        System.out.println(list);
    }



}
