package ioImooc;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by xgh on 2016/1/18.
 */
/*
RandomAccessFile支持随机访问文件，可以访问文件的任意位置
1.java文件模型
    在硬盘上的文件是byte byte byte存储的，是数据的集合。
2. 打开文件
    两种模式 rw 读写  r 只读
    RandomAccessFile raf =new RandomAccessFile(file, "rw")
    文件指针，打开文件时指针在开头 pointer=0
3. 写方法
    raf.write(int/..)--->只写一个字节，同时指针指向下一个位置，准备再次写入
4. 读方法
    int b=raf.read() --->读一个字节
5. 文件读完要关闭

 */
public class RandomAccessFile_mine {
    public static void main(String args[])throws IOException{
        File demo=new File("demo");
        if(! demo.exists()){
            demo.mkdir();
        }
        File file=new File(demo,"raf.dat");
        if(!file.exists()){
            file.createNewFile();
        }

        RandomAccessFile raf=new RandomAccessFile(file,"rw");

        //指针位置
        System.out.println(raf.getFilePointer());

        raf.write('A');
        System.out.println(raf.getFilePointer());
        raf.write('B');

        int i=0x7fffffff;
        raf.write(i>>24);//高8位
        raf.write(i>>16);
        raf.write(i>>8);
        raf.write(i);
        System.out.println(raf.getFilePointer());

        raf.writeInt(i);

        String s="中";
        byte[] utf=s.getBytes("utf-16");
        raf.write(utf);

        System.out.println(raf.length());

        //将指针移动到头部
        raf.seek(0);

        byte[] buf=new byte[(int)raf.length()];
        raf.read(buf);
        System.out.println(Arrays.toString(buf));
        for(Byte b:buf){
            System.out.println(Integer.toHexString(b));
        }
        raf.close();

    }


}
