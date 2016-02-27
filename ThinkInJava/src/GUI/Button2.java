package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xgh on 2016/2/20.
 */
public class Button2 extends JFrame{
    private JButton button1=new JButton("Button1");
    private JButton button2=new JButton("Button2");

    private JTextField txt=new JTextField(10);

    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name=((JButton)e.getSource()).getText();
            txt.setText(name);
        }
    }
    private ButtonListener bl=new ButtonListener();

    public Button2(){
        button1.addActionListener(bl);
        button2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(button1);
        add(button2);
        add(txt);
    }
    public static void main(String[] args){
        JFrame frame=new Button2();
        frame.setTitle("Button world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,100);
        frame.setVisible(true);
    }
}
