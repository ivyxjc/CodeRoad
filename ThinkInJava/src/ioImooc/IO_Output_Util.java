package ioImooc;

import java.io.*;

/**
 * Created by xgh on 2016/1/18.
 */
public class IO_Output_Util {
    public static void printHex(String filename)throws IOException{
        FileOutputStream out = new FileOutputStream(filename);
        out.write('A');
        out.write('B');

        int a=10;//write每次写一个字节
        out.write(a>>24);
        out.write(a>>16);
        out.write(a>>8);
        out.write(a);

        byte[] utf="慕课".getBytes("utf-8");
        out.write(utf);
        out.close();
        IO_Input_Util.readHex(filename);

    }

    public static void copyFileByBuffer(File srcFile,File destFile)throws IOException{
        if(!srcFile.exists()){
            throw new FileNotFoundException("the file "+srcFile+" does not exists");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"is not a file");
        }
        FileInputStream in =new FileInputStream(srcFile);
        FileOutputStream out=new FileOutputStream(destFile);
        byte[] buf=new byte[8*1024];
        int b;
        while ((b=in.read(buf,0,buf.length))!=-1){
            out.write(buf,0,b);
            out.flush();
        }
    }

    public static void copyFileByByte(File srcFile,File destFile)throws IOException{
        if(!srcFile.exists()){
            throw new FileNotFoundException("the file "+srcFile+" does not exists");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"is not a file");
        }
        FileInputStream in =new FileInputStream(srcFile);
        FileOutputStream out=new FileOutputStream(destFile);
        int b;
        while ((b=in.read())!=-1){
            out.write(b);
            out.flush();
        }
    }



}
