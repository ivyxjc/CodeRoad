package stone.runner;

/**
 * Created by jc on 11/28/2016.
 */
public class Test {
    public static void main(String[] args){
//        Father a=new Son();
//        a.father_1();
//        a.father_2();
//        a.father_3();

        Son s=Father.newSingle(Son.class.getName());
        s.son_1();

    }
}
