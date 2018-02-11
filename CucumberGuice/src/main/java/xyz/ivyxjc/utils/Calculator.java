package xyz.ivyxjc.utils;

public class Calculator {
    private Integer num1;
    private Integer num2;
    private Integer sum;

    public Calculator(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }


    public void calculate() {
        sum = num1 + num2;
    }

    public Integer getTotal() {
        return sum;
    }
}
