package observer;

import edu.princeton.algs4.StdOut;

import java.util.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by ivxyjc on 2016/11/18.
 */
public class Java_Observer {
    public static void main(String[] args){
        LiSi_4 lisi=new LiSi_4();

        HanFeiZi_4 hanfeizi=new HanFeiZi_4();

        hanfeizi.addObserver(lisi);

        hanfeizi.haveBreakfast();
        hanfeizi.haveFun();
    }
}

class HanFeiZi_4 extends java.util.Observable implements IHanFeiZi_3{
    @Override
    public void haveBreakfast() {
        System.out.println("han has breakfast");
        super.setChanged();
        super.notifyObservers("hanfeizi ha breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("han has fun");
        super.setChanged();
        super.notifyObservers("hanfeizi has fun");
    }
}

class LiSi_4 implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("lisi: observer hanfei...");
        this.report(arg.toString());
        System.out.println("report finish");
    }
    public void report(String reportText){
        StdOut.println("lisi report -->"+reportText);
    }
}
