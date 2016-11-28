package stone.runner;

/**
 * Created by jc on 11/28/2016.
 */
public class Son extends Father {



    @Override
    public void father_3() {
        System.out.println("son_father_3");
    }

    @Override
    public void father_1() {
        super.father_1();
        System.out.println("son_father_1");
    }

    public void son_1(){
        System.out.println("son_1");
    }


    public void son_2(){
        System.out.println("son_2");
    }
}
