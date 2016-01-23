package ioImooc;

import java.io.*;

/**
 * Created by xgh on 2016/1/18.
 */
/*
7.
DataOutputStream/DataInputStream
对流的拓展，可以更加方便地读取int，long，字符等类型数据
 */
public class IO_Data_Util {
    public static void main(String[] args)throws IOException{
        String file="demo\\dos.dat";
//        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
//
//        dos.writeInt(10);
//        dos.writeInt(-10);
//        dos.writeLong(-10);
//        dos.writeDouble(10);
//        dos.writeUTF("慕课ABC");
//        dos.writeChars("慕课ABC");
//        dos.close();
//        IO_Input_Util.readHex(file);

        IO_Input_Util.readHex(file);
        DataInputStream dis=new DataInputStream(new FileInputStream(file));

        System.out.println();
        int i=dis.readInt();
        System.out.println(i);

        i=dis.readInt();
        System.out.println(i);

        long j=dis.readLong();
        System.out.println(j);

        double k=dis.readDouble();
        System.out.println(k);

        String s=dis.readUTF();
        System.out.println(s);

        s=dis.readLine();
        System.out.println(s);

    }
}
