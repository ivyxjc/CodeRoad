package netImooc;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xgh on 2016/1/19.
 */
public class Socket_Server {
    public static void main(String[] args) {

        try {
            //1.创建一个服务器Socket，即ServerSocket，指定绑定的端口
            //并监听此端口
            ServerSocket serverSocket = new ServerSocket(9999);
            //2.调用accet()方法开始监听，等待客户端的练级
            System.out.println("服务器即将启动，等待客户端连接");
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();//字节输入流
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("client:" + info);
            }
            socket.shutdownInput();


            OutputStream os=socket.getOutputStream();
            PrintWriter pw=new PrintWriter(os);
            pw.write("welcome");



            pw.flush();

            //关闭资源
            br.close();
            isr.close();
            is.close();
            pw.close();
            os.close();

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

