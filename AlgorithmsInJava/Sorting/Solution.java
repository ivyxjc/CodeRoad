/**
 * Created by jc on 11/16/2015.
 */

import com.Princeton.lib.*;
public class Solution {
    public boolean isAnagram(String s, String t)
    {
        char [] sa=s.toCharArray();
        char [] ta=t.toCharArray();

        int saLength=sa.length;
        int taLength=ta.length;

        if(saLength!=taLength)
            return false;
        else{
            sort(sa);
            sort(ta);
            for(int i=0;i<sa.length;i++){
                if(sa[i]!=ta[i])
                    return false;
            }
        }
        return true;
    }

    public void sort(char[] a){
        int N=a.length;
        int tmp=1;
        while(tmp<N/3)
            tmp=3*tmp+1;

        while(tmp>=1) {
            for (int i = tmp; i < N; i++) {
                for (int j = i; j >= tmp; j -= tmp) {
                    if (a[j] < a[j - tmp]) {
                        exch(a, j, j - tmp);
                    }

                }
            }
            tmp = tmp / 3;
        }

    }

    public void exch(char [] a, int i, int j){
        char tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    public static void main(String[] args){

        String aa="abcdefg";
        String bb="abcdefg";
        boolean res=new Solution().isAnagram(aa,bb);
        System.out.println(res);
    }

}