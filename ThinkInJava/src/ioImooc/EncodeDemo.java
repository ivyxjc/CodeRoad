package ioImooc;

import java.io.UnsupportedEncodingException;

/**
 * Created by xgh on 2016/1/18.
 */
public class EncodeDemo {
    public static void main(String args[])throws UnsupportedEncodingException{
        //utf-8中文占用3个字节，英文占一个字节
        //gbk中文占两个字节，英文占一个字节
        String s ="联通abc";
        byte[] bytes1=s.getBytes();//转换成字节序列，用的是项目默认编码
        byte[] bytes2=s.getBytes("GBK");
        byte[] bytes3=s.getBytes("utf-8");
        byte[] bytes4=s.getBytes("utf-16be");

        for(byte b:bytes1){
            //System.out.println(b);
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        System.out.println("default");

        for(byte b:bytes2){
            //System.out.println(b);
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        System.out.println("GBK");


        for(byte b:bytes3){
            //System.out.println(b);
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        System.out.println("utf-8 ");


        for(byte b:bytes4){
            //System.out.println(b);
            System.out.print(Integer.toHexString(b&0xff)+" ");
        }
        System.out.println("utf-16be");
        //java是双字节编码 utf-16be编码
        String s2=new String(bytes3);
        System.out.println(s2);

    }
}
