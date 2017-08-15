package xyz.ivyxjc.observer;



/**
 * Created by ivyxjc on 2016/11/18.
 */

/**
 * 将观察者放置到被观察者内部,被观察者内部发生变化 调用观察者相应的方法,
 * 但是这个方法扩展性不强, 若后期要添加新的观察者, 需要变动被观察者的相应代码
 */

public class Client_2{
    public static void main(String[] args){
        HanFeiZi_2 hanFeiZi=new HanFeiZi_2();
        hanFeiZi.haveFun();
        hanFeiZi.haveBreakfast();

    }
}

interface IHanFeiZi_2 {
    void haveBreakfast();

    void haveFun();
}


interface  ILiSi_2{
    void update(String context);
}


class LiSi_2 implements ILiSi_2{

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

class HanFeiZi_2 implements IHanFeiZi_2{

    private ILiSi_2 lisi=new LiSi_2();

    @Override
    public void haveBreakfast() {
        System.out.println("han has breakfast");
        this.lisi.update("hanfeizi has breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("han has fun");
        this.lisi.update("hanfeizi has fun");
    }

}
