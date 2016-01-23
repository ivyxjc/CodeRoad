package ioImooc;

import java.io.File;
import java.io.IOException;

/**
 * Created by xgh on 2016/1/19.
 */
public class IO_Buffer_Util_test {
    public static void main(String args[])throws IOException{

        long start;
        long end;

        start=System.currentTimeMillis();
        IO_Buffer_Util.copyFileByBuffer(new File("F:\\xjc\\jdk-8u65-docs-all.zip"),new File("demo\\22.rar"));
        end=System.currentTimeMillis();
        System.out.println(end-start);

        start=System.currentTimeMillis();
        IO_Output_Util.copyFileByBuffer(new File("F:\\xjc\\jdk-8u65-docs-all.zip"),new File("demo\\222.rar"));
        end=System.currentTimeMillis();
        System.out.println(end-start);

//        start=System.currentTimeMillis();
//        IO_Output_Util.copyFileByByte(new File("demo\\11.jpg"),new File("demo\\2222.jpg"));
//        end=System.currentTimeMillis();
//        System.out.println(end-start);
    }
}
