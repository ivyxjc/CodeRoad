package netImooc;

/**
 * Created by xgh on 2016/1/20.
 */
public class tt {
    public static void main(String[] args){
        int tmp=1;
        int i=0;
        while(tmp!=0){
            i++;
            if(i%2==0||i%3==0){
                tmp--;
            }
        }
        System.out.println(i);
    }
}
