package xyz.ivyxjc.builder;


/**
 * Created by 2438981 on 2016/11/17.
 */
abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }

    public void setBoard(String board){
        mBoard=board;
    }

    public void setDisplay(String display){
        mDisplay=display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer [mBoard="+ mBoard+", mDisplay="+mDisplay+", mOS="+mOS+"]";
    }
}


class Macbook extends Computer{
    protected Macbook(){

    }
    @Override
    public void setOS() {
        mOS="Mac OS X 10.10";
    }
}

//抽象Builder类
abstract class Builder{

    public abstract void buildBoard(String board);
    public abstract void buildDispaly(String display);
    public abstract void buildOS();
    public abstract Computer create();
}

//具体Builder类
class MacbookBuilder extends Builder{

    private Computer mComputer=new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDispaly(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}

class Direcotr{
    Builder mBuilder=null;

    public Direcotr(Builder builder){
        mBuilder=builder;
    }

    public void construct(String board,String dispaly){
        mBuilder.buildBoard(board);
        mBuilder.buildDispaly(dispaly);
        mBuilder.buildOS();
    }

}

public class BuildTest{
    public static void main(String[] args){
        Builder builder=new MacbookBuilder();

        Direcotr pcDirector=new Direcotr(builder);

        pcDirector.construct("intel","retina");
        System.out.println("Computer Info : " + builder.create().toString());
    }
}
