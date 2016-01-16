package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by jc on 11/20/2015.
 */
public class DirList {
    public  static  void main(String[] args){
        File path=new File(".");

        String [] list;

        if(args.length==0)
            list=path.list();
        else
            list=path.list(new DirFilter(args[0]));
    }
}

class DirFilter implements FilenameFilter{
    private Pattern mPattern;

    public DirFilter(String regex){
        mPattern=Pattern.compile(regex);
    }

    public boolean accept(File dir, String name){
        return mPattern.matcher(name).matches();
    }
}