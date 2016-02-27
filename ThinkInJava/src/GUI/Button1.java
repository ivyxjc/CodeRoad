package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xgh on 2016/2/20.
 */
public class Button1 extends JFrame {
    private JButton b1=new JButton("Button1");
    private JButton b2=new JButton("Button2");
    public Button1(){



        setLayout(new FlowLayout());
        add(b1);
        add(b2);
    }
    public static void main(String[] args){
        JFrame frame=new Button1();
        frame.setTitle("Button world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,100);
        frame.setVisible(true);
    }

}
