package ioImooc;

import java.io.File;
import java.io.IOException;

/**
 * Created by xgh on 2016/1/18.
 */

/*
java.io.File类用于表示文件（目录）
File类只用于文件（目录）的信息（名称，大小），不能访问其中的内容
 */
public class File_mine {
    public static void main(String args[]){
        File f=new File("F:\\ivyxjc\\联.txt");
        System.out.println(f.isDirectory());

        System.out.println(f.isFile());
        if(!f.exists()){
            f.mkdir();//如果是多级目录 用file.mkdirs();
        }

        else
            f.delete();

        File f2=new File("F:\\ivyxjc\\日记.txt");
        if(!f2.exists()){
            try{
                f2.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else
            f2.delete();
        System.out.println(f);
    }
}
