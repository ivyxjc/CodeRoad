package com.jc.Union_Find;

import com.Princeton.lib.StdDraw;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by xgh on 2016/2/2.
 */
public class UF_test {
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("F:\\ivyxjc\\algs4-data\\algs4-data\\largeUF.txt");
        Scanner in=new Scanner(fis);
        Calendar calendar=Calendar.getInstance();
        long time1=calendar.getTimeInMillis();
        int uf_size=in.nextInt();
        UF uf=new UF(uf_size);

        int uf_size_sqrt=(int)Math.sqrt(uf_size)+1;
        int scale_length=uf_size_sqrt+10;
//
//        StdDraw.setXscale(0,scale_length);
//        StdDraw.setYscale(0,scale_length);



        for(int i=0;i<uf_size;i++){
            int p=in.nextInt();
            int q=in.nextInt();

            int px=p%uf_size_sqrt;
            int py=p/uf_size_sqrt;
            int qx=q%uf_size_sqrt;
            int qy=q/uf_size_sqrt;


            if(uf.connected(p,q))
                continue;

//            StdDraw.point(px,py);
//            StdDraw.point(qx,qy);
//
//            StdDraw.line(px,py,qx,qy);

            uf.union(p,q);

        }

        System.out.println(uf.count());
        calendar=Calendar.getInstance();
        long time2=calendar.getTimeInMillis();
        System.out.println(time2-time1);

    }
}
