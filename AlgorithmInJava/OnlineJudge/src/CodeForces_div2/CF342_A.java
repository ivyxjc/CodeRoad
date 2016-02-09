package CodeForces_div2;

import java.util.Scanner;

/**
 * Created by xgh on 2016/2/7.
 */
public class CF342_A {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long a=in.nextLong();
        long b=in.nextLong();
        long c=in.nextLong();

        long res=0;
        long glass_buy=b;
        long glass_back=c;
        long glass_cost=b-c;
        long plastic_cost=a;
        if(plastic_cost<=glass_cost){
            res=n/plastic_cost;
            System.out.println(res);
            return;
        }else{
            res+=(n-glass_buy)/glass_cost;
            if(plastic_cost<glass_buy){
                res+=glass_buy/plastic_cost;
            }else {
                res++;
            }
        }
        System.out.println(res);
    }
}
