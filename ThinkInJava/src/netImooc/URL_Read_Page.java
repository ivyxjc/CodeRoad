package netImooc;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xgh on 2016/1/19.
 */
public class URL_Read_Page {
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.baidu.com/");
            InputStream is=url.openStream();
            InputStreamReader isr=new InputStreamReader(is,"utf-8");
            BufferedReader br=new BufferedReader(isr);
//            BufferedWriter bw=new BufferedWriter(
//                    new OutputStreamWriter(
//                            new FileOutputStream("demo\\baidu.html")
//                    ,"utf-8")
//            );

//            int c;
//            char[] buffer=new char[1024];
//            while((c=br.read(buffer,0,buffer.length))!=-1){
//                bw.write(buffer,0,c);
//            }
            PrintWriter pw=new PrintWriter("demo\\baidu.html");
            String data;
            while((data=br.readLine())!=null){
                System.out.println(data);
                pw.write(data);
            }
        }catch (MalformedURLException e){

        }catch (IOException e){

        }
    }
}
