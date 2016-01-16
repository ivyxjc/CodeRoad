package com.jc.Graph;

import java.util.Random;

/**
 * Created by jc on 1/1/2016.
 */

/*
该段代码是为了解决蒙提霍尔问题（即三门问题）
testSize是测试的长度
int doorsNum是门的数量
 */
public class ThreeDoorProblem {
    private  int testSize=60000;
    private  int doorsNum=4;
    private int [] prizeArray;
    private int [] guessArray;
    private int [] excludeArray;
    private int [] resultArray;


    private  int abs(int i){
        if(i<=0)
            i=-i;
        return i;
    }

    private void init(){
        prizeArray = new int[testSize];
        guessArray=new int[testSize];
        excludeArray = new int[testSize];
        resultArray = new int[testSize];
        for(int i=0;i<testSize;i++){
            resultArray[i]=-2;
        }
    }

    private void dataInitialize(){
        Random random=new Random();
        for(int i=0;i<testSize;i++){
            prizeArray[i]=abs(random.nextInt()%doorsNum);
            random=new Random(random.nextLong());
            guessArray[i]=abs(random.nextInt()%doorsNum);
            random=new Random(random.nextLong());
            excludeArray[i]=abs(random.nextInt()%doorsNum);
            while((excludeArray[i]==prizeArray[i])||(excludeArray[i]==guessArray[i])){
                excludeArray[i]=abs(random.nextInt()%doorsNum);
            }
        }

    }

    private double procedure(){
        int getPrizeCount=0;
        for(int i=0;i<testSize;i++){
            if(guessArray[i]==prizeArray[i]){
                resultArray[i]=1;
            }
            else
                resultArray[i]=0;
        }

        for(int i=0;i<testSize;i++){
            if(resultArray[i]==1){
                getPrizeCount++;
            }
        }

        return (double)getPrizeCount/testSize;

    }

    public static void main(String [] args){
        //Random random=new Random();
        //System.out.println(abs(random.nextInt()%3));
        ThreeDoorProblem test=new ThreeDoorProblem();
        test.init();
        test.dataInitialize();
        System.out.println(test.procedure());
    }
}
