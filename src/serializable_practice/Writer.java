package serializable_practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by jc on 11/30/2016.
 */
public class Writer {

    public static void write(Object o){
        try {
            FileOutputStream fos = new FileOutputStream("E:\\Coding\\Java\\tmpOut\\model.ser");
            ObjectOutputStream ow=new ObjectOutputStream(fos);
            ow.writeObject(o);
            ow.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
