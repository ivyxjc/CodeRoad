package wordsCalculate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by xgh on 2016/2/25.
 */
public class WordsCalculate {
    private static String filename="F:\\ivyxjcUniversity\\ssss.md";


    public static void main(String[] args) throws IOException{
        InputStreamReader isr=new InputStreamReader(new FileInputStream(filename),"utf-8");
        char []buffer=new char[8*1024];
        int c;
        int count=0;
        while(isr.read(buffer,0,buffer.length)!=-1){
            for(int i=0;i<buffer.length;i++){
                if(Character.toString(buffer[i]).matches("[\\u4E00-\\u9FA5]+")){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
