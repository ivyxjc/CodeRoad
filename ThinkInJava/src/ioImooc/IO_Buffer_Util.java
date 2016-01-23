package ioImooc;

import java.io.*;

/**
 * Created by xgh on 2016/1/19.
 */
/*
8.BufferedInputStream BufferedOutputStream
这两个流类为IO提供了带缓冲区的操作，一般都会加上缓冲，这种流模式提高了IO性能
 */
public class IO_Buffer_Util {
    /**
     * 进行文件的拷贝，利用带缓冲的字节流
     * @param:srcFile
     * @param:destFile
     * @throws java.io.IOException
     */
    public static void copyFileByBuffer(File srcFile,File destFile)throws IOException{

        if(!srcFile.exists()){
            throw new FileNotFoundException(srcFile+"is not found");
        }

        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+" is not a file");
        }

        BufferedInputStream bis =new BufferedInputStream(new FileInputStream(srcFile),20*1024);

        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream(destFile),20*1024);

        int c=0;
        while((c=bis.read())!=-1){
            bos.write(c);
            //bos.flush();//刷新缓冲区
        }
        bis.close();
        bos.close();
    }


}
