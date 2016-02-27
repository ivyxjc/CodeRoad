package GUI;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by xgh on 2016/2/20.
 */
public class SubmitSwingProgram extends JFrame {
    JLabel mJLabel;
    public SubmitSwingProgram(){
        super("hello world");
        mJLabel=new JLabel("A label");
        add(mJLabel);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setVisible(true);
    }
    static SubmitSwingProgram ssp;

    public static void main(String[] args)throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp=new SubmitSwingProgram();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.mJLabel.setText("Different");
            }
        });
    }
}
