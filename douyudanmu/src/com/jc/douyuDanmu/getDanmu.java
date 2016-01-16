package com.jc.douyuDanmu;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by jc on 1/4/2016.
 */
public class getDanmu {
    private Socket mSocket;

    private void  init() throws IOException{
         mSocket = new Socket("www.douyu.tv",12602);
    }


}
