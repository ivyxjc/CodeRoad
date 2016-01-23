package netImooc;

import java.io.*;
import java.net.Socket;

/**
 * Created by xgh on 2016/1/20.
 */
public class Socket_Client {
    public static void main(String[] args){
        //1.创建客户端Socket，指定服务器地址和端口
        try {
            Socket socket=new Socket("localhost",9999);
        //2.客户端像服务发送登录信息
            OutputStream os=socket.getOutputStream();//字节输出流
            PrintWriter pw=new PrintWriter(os);
            pw.write("用户名：admin;密码：123");
            pw.flush();
            socket.shutdownOutput();



            InputStream is=socket.getInputStream();
            BufferedReader br=new BufferedReader(
                    new InputStreamReader(is)
            );
            String info=null;

            while((info=br.readLine())!=null){
                System.out.println("server:"+info);
            }

            pw.close();
            os.close();
            br.close();
            is.close();

            socket.close();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
