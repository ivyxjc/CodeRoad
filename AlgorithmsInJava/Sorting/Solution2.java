/**
 * Created by jc on 11/18/2015.
 */
/**
 * Created by jc on 11/16/2015.
 */

import com.Princeton.lib.*;
public class Solution2 {
    public boolean isAnagram(String s, String t)
    {
        char [] sa=s.toCharArray();
        char [] ta=t.toCharArray();

        int saLength=sa.length;
        int taLength=ta.length;

        if(saLength!=taLength)
            return false;
        else if(saLength==0){
            return true;
        }
        else if(saLength==1) {
            if (sa[0] != ta[0])
                return false;
            else
                return true;
        }
        else{
            sort(sa,0,saLength-1);
            sort(ta,0,taLength-1);
            return sa==ta;
        }

    }

    public void sort(char[] a,int lo , int hi){
        if(hi<=lo)
            return;

        int j=partition(a,lo,hi);

        sort(a,lo,j-1);
        sort(a,j+1,hi);

    }

    public  int partition(char[] a,int lo, int hi){
        int i=lo;
        int j=hi+1;
        char v=a[lo];
        while(true){
            while(a[++i]<v)
                if(i==hi)
                    break;
            while(v<a[--j])
                if(j==lo)
                    break;
            if(i>=j)
                break;
            exch(a,lo,j);
        }
        return j;
    }

    public void exch(char [] a, int i, int j){
        char tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    public static void main(String[] args){

        String aa="abc";
        String bb="bda";
        boolean res=new Solution().isAnagram(aa,bb);
        System.out.println(res);
    }

}