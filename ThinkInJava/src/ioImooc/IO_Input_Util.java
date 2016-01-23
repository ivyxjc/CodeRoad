package ioImooc;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by xgh on 2016/1/18.
 */


/*
字节流，字符流

1.字节流
(1) InputStream OutputStream  都是抽象类
InputStream抽象了应用程序读取数据的方式
OutputStream抽象了应用程序写出数据的方式
(2)EOF=End 读到-1就读到结尾
(3)输入流基本方法
int b=in.read();读取一个字节无符号填充到int低8位，-1是EOF
in.read(byte[] buf)
in.read(byte[] buf,int start,int size)
(4)输出流基本方法
out.write(int b)写出byte到流，b的低8位
out.write(byte[] buf)将buf字节数组都写入流
out.write(byte[] buf,int start,int size)从start开始，size的内容写入流
(5)FileInputStream
实现了文件上的读取
 */
public class IO_Input_Util{
    /*
    以字节的形式读取指定文件内容，按照16进制输出到控制台
    每输出10个字节就换行
     */
    public static void readHex(String fileName) throws IOException{
        //把文件作为字节流读操作
        FileInputStream in=new FileInputStream(fileName);

        int b;
        int i=0;
        while((b=in.read())!=-1) {
            if(b<=0xf){
                System.out.print("0"+Integer.toHexString(b)+" ");
            }
            else {
                System.out.print(Integer.toHexString(b) + " ");
            }
            i++;
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        in.close();
    }

    /*

     */
    public static void readHexByByteArray(String fileName)throws IOException{
        FileInputStream in=new FileInputStream(fileName);

        byte[] buf=new byte[20*1024];
        /*从in中批量读取字节，放入到buf这个字节数组中，从第0个位置
        开始放，最多放buf.length个
        返回的是读到的字节的个数
         */
        int j=0;
        int bytes;
//        bytes=in.read(buf,0,buf.length);
//        for(int i=0;i<bytes;i++){
//            int tmp=(int)buf[i];//先将byte升到int
//            tmp=tmp&0xff;//将前24位置0
//            if(tmp<=0xf){
//                System.out.print("0");
//            }
//            System.out.print(Integer.toHexString(tmp)+" ");
//            j++;
//            if(j%10==0){
//                System.out.println();
//            }
//        }

        while((bytes=in.read(buf,0,buf.length))!=-1){
            for(int i=0;i<bytes;i++){
                int tmp=(int)buf[i];//先将byte升到int
                tmp=tmp&0xff;//将前24位置0
                if(tmp<=0xf){
                    System.out.print("0");
                }
                System.out.print(Integer.toHexString(tmp)+" ");

                j++;
                if(j%10==0){
                    System.out.println();
                }
            }
        }
        in.close();
    }
}
