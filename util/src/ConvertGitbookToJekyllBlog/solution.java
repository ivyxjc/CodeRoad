package ConvertGitbookToJekyllBlog;

import java.io.*;

/**
 * Created by xgh on 2016/2/17.
 */
public class solution {
    private static String prefix_first="---\n" +
            "layout: post\n" +
            "title: ";
    private static String prefix_second="\n" +
            "category: \n" +
            "tags: [javagitbook ]\n" +
            "keywords:\n" +
            "description:\n" +
            "---\n";
    public static void  writePrefix(String inputPath,String outPutPath,String fileName){
        try {

            InputStreamReader reader=new InputStreamReader(
                    new FileInputStream(inputPath+"\\"+fileName),"utf-8");//默认项目编码
            String fileTime=getFileCreateTime(inputPath+"\\"+fileName);
            String outputFileName=outPutPath+"\\"+fileTime+"-"+fileName.replace("_","-");
            System.out.println(outputFileName);
            OutputStreamWriter writer = new OutputStreamWriter(
                    new FileOutputStream(outputFileName));
            writer.write(prefix_first);
            writer.write(fileName.split("\\.")[0]);
            writer.write(prefix_second);
            char[] buffer=new char[1024];
            int c;
            while((c=reader.read(buffer,0,buffer.length))!=-1) {
                //System.out.println(buffer);
                writer.write(buffer,0,c);
                writer.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //获取路径下文件名称
    public static String[] getFilesName(String filePath){
        try{
            File directory=new File(filePath);
            if(!directory.isDirectory()){
                throw new IOException(filePath+" is not directory");
            }
            String [] res=directory.list();
            return res;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    //获取文件创建时间
    public static String getFileCreateTime(String filename){
        String strTime=null;
        try {
            Process p = Runtime.getRuntime().exec("cmd /C dir "
                    + filename
                    + "/tc" );
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"gbk"));
            String line;
            int i=0;
            while((line = br.readLine()) != null){
                //System.out.println(line);
                i++;
                if(i==6){
                    strTime = line.substring(0,17);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] res=strTime.split("/");
        res[2]=res[2].split(" ")[0];
        String resString=res[0]+"-"+res[1]+"-"+res[2];
        return resString;
    }

    public static String inPath="C:\\Users\\xgh\\Downloads\\ThinkInJava_Book-master\\ThinkInJava_Book-master";
    public static String outPath="F:\\ivyxjc\\java\\util\\demo";

    public static void solve(){
        String[] filesName=getFilesName(inPath);
        for(int i=0;i<filesName.length;i++){
            writePrefix(inPath,outPath,filesName[i]);
        }

    }

    public static void main(String[] args){
        //writePrefix(inPath,outPath,"list.md");
        //getFileCreateTime("demo\\write.dat");
        //System.out.println(getFileCreateTime("C:\\Users\\xgh\\Downloads\\ThinkInJava_Book-master\\ThinkInJava_Book-master\\README.md"));
        solve();
    }

}
