package xyz.ivyxjc.observer;

import java.util.ArrayList;

interface Observable {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver(String context);

}

interface Observer {
    void update(String str);
}

interface IHanFeiZi_3 {
    void haveBreakfast();

    void haveFun();
}

/**
 * Created by ivxyjc on 2016/11/18.
 */
public class Client_3_good {

    public static void main(String[] args) {
        Observer lisi = new LiSi_3();
        Observer liusi = new LiuSi_3();
        Observer wangsi = new WangSi_3();
        HanFeiZi_3 hanfeizi = new HanFeiZi_3();

        hanfeizi.addObserver(lisi);
        hanfeizi.addObserver(liusi);
        hanfeizi.addObserver(wangsi);

        hanfeizi.haveBreakfast();
    }


}

class HanFeiZi_3 implements Observable, IHanFeiZi_3 {

    //存放observer
    private ArrayList<Observer> observerList = new ArrayList<Observer>();


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }

    @Override
    public void haveBreakfast() {
        System.out.println("hanfeizi has breakfast...");
        this.notifyObserver("han has breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("hanfeizi has fun...");
        this.notifyObserver("han has fun");
    }
}

class LiSi_3 implements Observer {
    @Override
    public void update(String context) {
        System.out.println("lisi: xyz.ivyxjc.observer hanfei...");
        this.report(context);
        System.out.println("report finish");
    }

    public void report(String reportText) {
        System.out.println("lisi report -->" + reportText);
    }
}

class WangSi_3 implements Observer {
    @Override
    public void update(String context) {
        System.out.println("wangesi: xyz.ivyxjc.observer hanfei...");
        this.report(context);
        System.out.println("report finish");
    }

    public void report(String reportText) {
        System.out.println("wangsi report -->" + reportText);
    }
}

class LiuSi_3 implements Observer {
    @Override
    public void update(String context) {
        System.out.println("liusi: xyz.ivyxjc.observer hanfei...");
        this.report(context);
        System.out.println("report finish");
    }

    public void report(String reportText) {
        System.out.println("liusi report -->" + reportText);
    }
}
