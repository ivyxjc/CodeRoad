package builder;

import edu.princeton.algs4.StdOut;

/**
 * Created by 2438981 on 2016/11/17.
 */
public class BuilderLinked {
    public static void main(String[] args){
        Macbook_2 computer=(Macbook_2) new MacbookBuilder_2().setBoard("intel")
                                                .setDispaly("retina")
                                                .setOS().create();
        StdOut.println("Computer Info : "+computer.toString());
    }
}

abstract class Builder_2 {
    public abstract Builder_2 setBoard(String board);
    public abstract Builder_2 setDispaly(String display);
    public abstract Builder_2 setOS();
    public abstract Computer_2 create();
}

abstract class Computer_2 {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer_2(){

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

class Macbook_2 extends Computer_2{
    protected Macbook_2(){

    }
    @Override
    public void setOS() {
        mOS="Mac OS X 10.10";
    }
}


class MacbookBuilder_2 extends Builder_2{

    private Macbook_2 mMacbook_2=new Macbook_2();
    @Override
    public Builder_2 setBoard(String board) {
        mMacbook_2.setBoard(board);
        return this;
    }

    @Override
    public Builder_2 setDispaly(String display) {
        mMacbook_2.setDisplay(display);
        return this;
    }

    @Override
    public Builder_2 setOS() {
        mMacbook_2.setOS();
        return this;
    }

    @Override
    public Computer_2 create(){
        return mMacbook_2;
    }
}

