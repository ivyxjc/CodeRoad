package xyz.ivyxjc.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jc on 1/7/2017.
 */
public class UseCaseTracker {
    public static void trackUserCases(List<Integer> useCases, Class<?> cl){
        for(Method m:cl.getDeclaredMethods()){
            UseCase uc=m.getAnnotation(UseCase.class);
            if(uc!=null){
                System.out.println("Found Use Case:"+uc.id()+" "+uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
    }

    public static void main(String[] args){
        List<Integer> useCases=new ArrayList<>();
        Collections.addAll(useCases,47,48,49,50);
        trackUserCases(useCases,PasswordUtils.class);
    }
}
