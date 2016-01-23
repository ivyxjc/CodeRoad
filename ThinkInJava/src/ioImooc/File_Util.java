package ioImooc;

import java.io.File;
import java.io.IOException;

/**
 * Created by xgh on 2016/1/18.
 */
//列出File类的一些常用操作
/*
        public String[] list()
        public String[] list(FilenameFilter filter)

Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
If this abstract pathname does not denote a directory, then this method returns null.

        public File[] listFiles()
        public File[] listFiles(FilenameFilter filter)

Returns an array of abstract pathnames denoting the files and directories in the
directory denoted by this abstract pathname that satisfy the specified filter.

 */
public class File_Util {
    public static void listDirectory(File dir)throws IOException{
        if(!dir.exists()){
            throw new IllegalArgumentException("目录:"+dir+"不存在");
        }
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir+"不是目录");
        }

        String [] filenames=dir.list();

        File[] files=dir.listFiles();
//        for(String b:filenames){
//            System.out.println(dir+"\\"+b);
//        }
        for(File b:files){
            if(b.isDirectory()){
                System.out.println(b);
                listDirectory(b);
            }
            else{
                System.out.println(b);
            }
        }

    }

}
