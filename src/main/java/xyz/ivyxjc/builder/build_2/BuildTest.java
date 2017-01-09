package xyz.ivyxjc.builder.build_2;


import edu.princeton.algs4.StdOut;

/**
 * Created by 2438981 on 2016/11/17.
 */
public class BuildTest {
    public static void main(String[] args){
        ConcreteProductA A= (ConcreteProductA)new A_Buider().setArg_1("aa")
                                        .setArg_2("bb").create();
        StdOut.print(A);

    }
}

abstract class abstractProduct{
    protected String arg_1;
    protected String arg_2;

    protected abstract void setArg_1(String arg_1);

    protected abstract void setArg_2(String arg_2);

    @Override
    public String toString() {
        return "arg_1: "+arg_1+", arg_2: "+arg_2;
    }
}

class ConcreteProductA extends abstractProduct{

    protected void setArg_1(String arg_1){
        this.arg_1=arg_1;
    }

    protected void setArg_2(String arg_2){
        this.arg_2=arg_2;
    }
}

abstract class Builder {
    public abstract Builder setArg_1(String arg_1);

    public abstract Builder setArg_2(String arg_2);

    public abstract abstractProduct create();
}

class A_Buider extends Builder{
    private ConcreteProductA mConcreteProductA=new ConcreteProductA();

    @Override
    public Builder setArg_1(String arg_1) {
        mConcreteProductA.setArg_1(arg_1);
        return this;
    }

    @Override
    public Builder setArg_2(String arg_2) {
        mConcreteProductA.setArg_2(arg_2);
        return this;
    }

    @Override
    public abstractProduct create(){
        return mConcreteProductA;
    }
}
