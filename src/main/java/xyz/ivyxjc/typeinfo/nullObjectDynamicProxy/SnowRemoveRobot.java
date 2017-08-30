package xyz.ivyxjc.typeinfo.nullObjectDynamicProxy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ivxyjc on 2017/1/9.
 */
public class SnowRemoveRobot implements Robot {
    private String name;
    
    public SnowRemoveRobot(String name){
        this.name=name;
    }
    
    @Override
    public String name() {
        return name; 
    }

    @Override
    public String model() {
        return "SnowBot 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    @Override
                    public String description() {
                        return name + " can shovel snoe";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {
                    @Override
                    public String description() {
                        return name + " can chip ice";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation() {
                    @Override
                    public String description() {
                        return name+" can clear the roof";
                    }

                    @Override
                    public void command() {
                        System.out.println(name+" clearing the roof");
                    }
                }
        );
    }

    public static void main(String[] args){
        Robot.Test.test(new SnowRemoveRobot("Slusher"));
    }
}
