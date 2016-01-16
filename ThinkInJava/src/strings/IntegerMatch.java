package strings;

/**
 * Created by jc on 11/7/2015.
 */
public class IntegerMatch {
    public static  void main(String[] args){
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("\\134".matches("(-|\\\\)\\d+"));
    }
}
