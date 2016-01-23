package ioImooc;

import java.io.*;

/**
 * Created by xgh on 2016/1/19.
 */
public class IO_Filter {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("demo\\reader.dat"),"utf-16be"
                )
        );

        BufferedWriter bw=new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("demo\\writer.dat"),"utf-16be"
                )
        );

        String line;

        PrintWriter pw=new PrintWriter("demo\\writer.dat");
        while ((line=br.readLine())!=null){
            System.out.println(line);
//            bw.write(line);
//            bw.newLine();//不写这一句文件会不换行
//            bw.flush();
            pw.println(line);
            pw.flush();
        }
        br.close();
        bw.close();
        pw.close();
    }
}
