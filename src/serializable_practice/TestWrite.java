package serializable_practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jc on 11/30/2016.
 */
public class TestWrite {

    public static void main(String[] args){
        ArrayList<Model> list=new ArrayList<>();
        Random random=new Random();
        random.nextFloat();

        for(int i=0;i<10;i++){
            Model m=new Model();
            m.setTitle(random.nextDouble()+"");
            m.setUrl(random.nextDouble()+"");
            m.setContent(random.nextDouble()+"");
            list.add(m);
        }

        Writer.write(list);

    }
}
