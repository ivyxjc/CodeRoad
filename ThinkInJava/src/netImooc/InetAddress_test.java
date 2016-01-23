package netImooc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by xgh on 2016/1/19.
 */
public class InetAddress_test {
    public static void main(String[] args)throws UnknownHostException{
        InetAddress address=InetAddress.getLocalHost();

        System.out.println("name:"+address.getHostName());
        System.out.println("IP:"+address.getHostAddress());
        byte[] bytes=address.getAddress();
        for(byte i:bytes){
            int tmp=i;
            tmp=tmp&0xff;
            System.out.println(Integer.toString(tmp));
        }
        System.out.println("IP "+ bytes);
        System.out.println(address);

        InetAddress address2=InetAddress.getByName("XGH-PC");
        System.out.println("name:"+address2.getHostName());
        System.out.println("IP:"+address2.getHostAddress());


    }
}
