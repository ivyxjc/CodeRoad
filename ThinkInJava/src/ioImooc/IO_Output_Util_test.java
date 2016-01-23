package ioImooc;

import java.io.File;
import java.io.IOException;

/**
 * Created by xgh on 2016/1/18.
 */
public class IO_Output_Util_test {
    public static void main(String[] args)throws IOException {
        IO_Output_Util.printHex("demo\\out_test.dat");
        try {
            IO_Output_Util.copyFileByBuffer(new File("demo\\out_test.dat"), new File("demo\\out_test_2.dat"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
