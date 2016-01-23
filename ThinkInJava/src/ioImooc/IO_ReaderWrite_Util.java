package ioImooc;

import java.io.*;

/**
 * Created by xgh on 2016/1/19.
 */
/*
字符流
(1)编码问题
(2)认识文本和文本文件
java的文本(char)是16位无符号证书，是字符的Unicode编码（双字节编码）
文件是byte byte byte ...的数据序列
文本文件时文本(char)序列按照某种编码方案(utf-8,utf-16be,gbk...)序列化为byte的文件
(3)字符流(Reader Writer)
字符的处理，一次处理一个字符
字符的底层仍然是基本的字节序列
字符流的基本实现
InputStreamReader 完成byte流解析成为char流，按照编码解析
OutputStreamWriter 提供char流到byte流，按照编码处理
 */
public class IO_ReaderWrite_Util {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr=new InputStreamReader(new FileInputStream("demo\\reader.dat"),"utf-8");//默认项目编码
        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("demo\\writer.dat"));
//        int c;
//        while((c=isr.read())!=-1){
//            System.out.print((char)c);
//        }

        char[] buffer =new char[8*1024];
        int c;
        //批量读取，放入buffer，从0开始放，最多放buffer.length
        while((c=isr.read(buffer,0,buffer.length))!=-1){
            osw.write(buffer,0,c);
            System.out.println(buffer);
        }

        isr.close();
        osw.close();

    }
}
