package serializable_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by jc on 11/30/2016.
 */
public class Reader {

    public static Object read(){
        Object res=null;
        try {
            FileInputStream fi=new FileInputStream("E:\\Coding\\Java\\tmpOut\\model.ser");
            ObjectInputStream oi=new ObjectInputStream(fi);
            res=oi.readObject();
            oi.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return res;
    }
}
