package com.jc.Graph2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xgh on 2016/1/30.
 */
class OJ {
    private ArrayList<Integer> al;


    public OJ(ArrayList<Integer> al){
        this.al=al;
    }


    public ArrayList<Integer> sort(){
        int N=al.size();
        for(int i=0;i<N;i++){
            Integer min=al.get(i);
            for(int j=i+1;j<N;j++){
                if(al.get(j)<min){
                    int tmp=al.get(j);
                    al.set(j,min);
                    al.set(i,tmp);
                }
            }
        }
        return al;
    }

    public ArrayList<Integer> duplicate(){
        int N=0;
        for(int i=1;i<N;i++){
            if(al.get(i-1)==al.get(i)){
                al.set(i-1,null);
            }
        }
        return al;
    }

    public Integer getElement(int index){
        return al.get(index);
    }

    public int size(){
        return al.size();
    }
}


public class Main{
    public static void main(String[] args) {
//        ArrayList<Integer> inList=new ArrayList<>();
//        Scanner cin = new Scanner(System.in);
//        while (cin.hasNextInt()) {
//            inList.add(cin.nextInt());
//        }
//        OJ oj=new OJ(inList);
//        oj.sort();
//        int N=oj.size();
//        for(int i=0;i<N;i++){
//            if(oj.getElement(i)!=null)
//                System.out.println(oj.getElement(i));
//        }

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        String s="";
        if((sum/1000)==0) {
            System.out.println(sum);
            return;
        }
        while(sum/1000!=0){
            int tmp=sum%1000;
            if(Math.abs(tmp)<10){
                s="00"+Math.abs(tmp)+s;
            }
            else if(Math.abs(tmp)<100){
                s="0"+Math.abs(tmp)+s;
            }
            else {
                s=Math.abs(tmp)+s;
            }
            s=","+s;
            sum=sum/1000;
        }
        s=sum+s;
        System.out.println(s);
    }


}




