package io;

import java.io.*;

/**
 * Created by jc on 11/22/2015.
 */
public class FormattedMemoryInput {
    public static void main(String[] args)
    throws IOException{

        try{
            DataInputStream in=new DataInputStream(
                new ByteArrayInputStream(
                    BufferedInputFile.read("E:\\program\\java\\ThinkInJava\\src\\io\\FormattedMemoryInput.java").getBytes()
                )
            );
            while(true){
                System.out.println((char)in.readByte());
            }
        }catch (EOFException e){
            System.err.println("End of Stream");
        }//这使用的是利用异常进行流控制。常常会被认为是对异常特性的错误使用

        String aa=new String("abced adagdsde");
        System.out.println(aa.getBytes());
    }

}
