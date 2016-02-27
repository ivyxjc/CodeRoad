package GUI;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by xgh on 2016/2/20.
 */
public class HelloSwing {

    public static void main(String[] args)throws Exception{
        JFrame frame=new JFrame("Hello Swing");
        JLabel label=new JLabel("A Lable");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
//        label.setText("Different");//不安全
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Different");
            }
        });
    }

}
