package strings;

/**
 * Created by jc on 11/7/2015.
 */

public class WitherStringBuilder {
    public String implicit(String [] fields){
        String result="";
        for(int i=0;i<fields.length;i++){
            result+=fields[i];//每次都会创建一个新的StringBuilder对象
        }
        return result;
    }

    public String explicit(String[] fields){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<fields.length;i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
    //如果已经知道String的大概长度，可以预先指定StringBuilder大小，避免多次分配缓冲

    public String buildWithBuffer(String[] fields){
        StringBuilder result=new StringBuilder(100);
        for(int i=0;i<fields.length;i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
}
