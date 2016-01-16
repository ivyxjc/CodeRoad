package strings;

/**
 * Created by jc on 11/7/2015.
 */

public class SimpleFormat {
    public static void main(String[] args){
        int x=5;
        double y=5.4444;
        System.out.println("Row 1:["+x+" "+y+"]");
        System.out.format("Row 1:[%d %f]\n",x,y);
        System.out.printf("Row 1:[%d %f]\n",x,y);
    }
}
