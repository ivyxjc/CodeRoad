package com.jc.service;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by jc on 1/4/2016.
 */
public class Config {
    private static final String SERVER_ADDRESS = "server_address";
    private static final String SERVER_PORT = "server_port";
    private static final String DOUYU_ADDRESS = "douyu_address";
    private static final String ROOM_ID = "room_id";
    private static final String GROUP_COUNT = "group_count";

    private static HashMap<String,String> map;

    static {
        map=new HashMap<String,String>();
        Properties properties=new Properties();
        try{
            properties.load(new FileInputStream(new File("E:\\program\\java\\douyudanmu\\src\\com\\jc\\config\\config.properties")));
            Enumeration keys=properties.keys();
            while(keys.hasMoreElements()){
                String currentKey=(String)keys.nextElement();
                String currentValue=properties.getProperty(currentKey);
                map.put(currentKey,currentValue);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        return map.get(key);
    }
    public static String getAddress() {
        return getProperty(SERVER_ADDRESS);
    }

    public static String getPort() {
        return getProperty(SERVER_PORT);
    }

    public static String getDouyu() {
        return getProperty(DOUYU_ADDRESS);
    }

    public static String getRoomId() {
        return getProperty(ROOM_ID);
    }

    public static String getGroupCount() {
        return getProperty(GROUP_COUNT);
    }

}
