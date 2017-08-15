package xyz.ivyxjc.observer;


/**
 * Created by ivyxjc on 2016/11/18.
 */


/**
 * 设置一个后台运行的thread不断地检查 被监测的类的相应状态 并作出响应,
 * 效率低, 占用内存 cpu过高.
 */
public class Client_1{
    public static void main(String[] args) throws InterruptedException{
        LiSi lisi=new LiSi();
        HanFeiZi hanFeiZi=new HanFeiZi();

        Spy spyBreakfast=new Spy(hanFeiZi,lisi,"breakfast");
        spyBreakfast.start();
        Spy spyFun=new Spy(hanFeiZi,lisi,"fun");
        spyFun.start();

//        Thread.sleep(100);
        hanFeiZi.haveBreakfast();
        System.out.println(hanFeiZi.isHavingBreakfast());
//        Thread.sleep(100);
        hanFeiZi.haveFun();
        System.out.println(hanFeiZi.isHavingFun());

    }
}


interface IHanFeiZi {
    void haveBreakfast();

    void haveFun();
}

class HanFeiZi implements IHanFeiZi{

    private boolean isHavingBreakfast=false;
    private boolean isHavingFun=false;

    @Override
    public void haveBreakfast() {
        System.out.println("han has breakfast");
        this.isHavingBreakfast=true;
    }

    @Override
    public void haveFun() {
        System.out.println("hanhas fun");
        this.isHavingFun=true;
    }


    //getter & setter
    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}

interface  ILiSi{
    void update(String context);
}

class LiSi implements ILiSi{
    @Override
    public void update(String context) {
        System.out.println("lisi: xyz.ivyxjc.observer hanfei...");
        this.report(context);
        System.out.println("report finish");
    }

    public void report(String reportText){
        System.out.println("lisi report -->" + reportText);
    }
}

class Spy extends Thread{
    private HanFeiZi mHanFeiZi;
    private LiSi mLiSi;

    private String type;

    public Spy(HanFeiZi _hanfeizi,LiSi _lisi, String _type){
        mHanFeiZi=_hanfeizi;
        mLiSi=_lisi;
        type=_type;
    }

    @Override
    public void run() {
        while(true){
            if(this.type.equals("breakfast")) {
                if (this.mHanFeiZi.isHavingBreakfast()) {
                    this.mLiSi.update("hanfeizi has breakfast");
                    this.mHanFeiZi.setHavingBreakfast(false);
                }
            }else{
//                System.out.println(this.mHanFeiZi.isHavingFun());
                if(this.mHanFeiZi.isHavingFun()){
                        this.mLiSi.update("hanfeizi has fun");
                        this.mHanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
