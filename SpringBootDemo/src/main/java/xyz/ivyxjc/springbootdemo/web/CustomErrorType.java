package xyz.ivyxjc.springbootdemo.web;

public class CustomErrorType {
    private int value;
    private String mesage;

    public CustomErrorType(int value, String message) {
        this.value = value;
        this.mesage = message;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
