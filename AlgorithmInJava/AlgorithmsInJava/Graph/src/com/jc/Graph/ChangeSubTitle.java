package com.jc.Graph;


import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created by jc on 12/12/2015.
 */
public class ChangeSubTitle{

    private static String GBK="GBK";
    private static String UTF="UTF-8";

    private static String lineNumPattern="\\d*";
    private static String SRTPattern="\\d{2}:\\d{2}:\\d{2},\\d{3} --> \\d{2}:\\d{2}:\\d{2},\\d{3}";

    private static ArrayList<String> res=new ArrayList<>();

    public static void read(String filename,String encodingModeNum){
        try{
            String encodingMode;
            switch (encodingModeNum){
                case "GBK":
                    encodingMode=GBK;
                    break;
                case "UTF-8":
                    encodingMode=UTF;
                    break;
                default:
                    encodingMode=UTF;
            }

            System.out.println(encodingMode);
            BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream(filename),encodingMode));
            String s;
            while((s=in.readLine())!=null){
                if(s.matches(lineNumPattern)) {
                    continue;
                }
                else if(s.matches(SRTPattern)){
                    continue;
                }
                else{
                    res.add(s);
                }


            }
            in.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }

    public static void out(String outFileName,String encodingModeNum) {
        try{
            String encodingMode;
            switch (encodingModeNum){
                case "GBK":
                    encodingMode=GBK;
                    break;
                case "UTF-8":
                    encodingMode=UTF;
                    break;
                default:
                    encodingMode=UTF;
            }
            OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(outFileName),encodingMode);
            for(String s:res){
                out.write(s+'\n');
                out.write('\n');
            }

            out.close();
        }catch (IOException e){
            System.out.println(e);
        }


    }

    /**
     * filename:需要转换的文件名;
     *outfilename: 目标文件名；
     *编码方式
     */

    public static void main(String[] args){
        String filename="G:\\downloads\\Harry.Potter.and.the.Half.Blood.Prince.2009.720p.BluRay.DTS.x264-WiKi.eng.srt";
        String outfilename="G:\\downloads\\sub.txt";
        read(filename,"GBK");

        out(outfilename,"UTF-8");

    }

}
