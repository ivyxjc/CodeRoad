package xyz.ivyxjc.beans.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

/**
 * Created by ivxyjc on 2017/1/11.
 */


public class ResourceLoaderTest {

    @Test
    public void test() throws IOException{
        ResourceLoader rl=new ResourceLoader();
        Resource resource=rl.getResource("resource_test.xml");
        InputStream inputStream=resource.getInputStream();

        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb =new StringBuilder();
        String line ="";
        while((line=reader.readLine())!=null){
            sb.append(line);
        }
        System.out.println(sb.toString());
        Assert.assertNotNull(inputStream);
    }
}
