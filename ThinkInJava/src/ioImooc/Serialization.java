package ioImooc;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by xgh on 2016/1/19.
 */

/*
(1).对象序列化，就是将Object转换为byte序列，反之叫对象的反序列化
(2).序列化流（ObjectOutpputStream),是过滤流--writeObject
    反序列化流（ObjectInputStream)--readObject

(3).序列化借口（Serializable)
对象必须实现序列化借口，才能进行序列化，否则将出现异常
该接口无任何方法，只是规定
自己完成序列化必须实现具有下面签名的方法
 private void writeObject(java.io.ObjectOutputStream out)
     throws IOException
 private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException;
 private void readObjectNoData()
     throws ObjectStreamException;

 */
class Student implements Serializable{
    private String name;
    private int number;
    private transient int age;//transient会使得该元素不会被jvm序列化

    private void writeObject(java.io.ObjectOutputStream s)throws java.io.IOException{
        s.defaultWriteObject();//把jvm能默认序列化的操作自己完成序列化
        s.writeInt(age);//自己完成序列化

    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException{
        s.defaultReadObject();//把jvm能默认反序列化的元素进行反序列化得操作
        this.age=s.readInt();//自己完成age的反序列化
    }

    public Student(){

    }

    public Student(String name, int number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }
    @Override
    public String toString() {
        return name+number+age;
    }
}

/*
 一个类实现了序列化接口，那么它的子类就都能实现序列化
 */
class Foo implements Serializable{
    public Foo(){
        System.out.println("foo");
    }
}

class Foo1 extends Foo{
    public Foo1(){
        System.out.println("foo111");
    }
}

class Foo2 extends Foo1{
    public Foo2(){
        System.out.println("foo222");
    }
}

class Bar{
    public Bar(){
        System.out.println("bar");
    }
}

class Bar1 extends Bar{
    private int i=0;

    public Bar1(){
        System.out.println("bar--"+i+i+i);
    }

    public Bar1(int i){
        this.i=i;
        System.out.println(i);
    }
}
class Bar2 extends Bar1 implements Serializable{
    public Bar2(int i){
        super(i);
        System.out.println("bar222");
    }
}

public class Serialization {
    public static void main(String[] args)throws Exception {
        String file = "demo\\obj.dat";
        //1.对象的序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
        Student stu=new Student("张三",100,20);
        oos.writeObject(stu);
        oos.flush();
        oos.close();
        //对象的反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        Student stu2=(Student)ois.readObject();
        System.out.println(stu2);
        ois.close();


        ObjectOutputStream oos2=new ObjectOutputStream(
                new FileOutputStream("demo\\obj1.dat")
        );

        Foo2 foo2=new Foo2();
        oos2.writeObject(foo2);
        oos2.flush();
        oos2.close();

        ObjectInputStream ois2=new ObjectInputStream(
                new FileInputStream("demo\\obj1.dat")
        );

        Foo2 foo2_2=(Foo2)ois2.readObject();
        ois2.close();


        ObjectOutputStream oos3=new ObjectOutputStream(
                new FileOutputStream("demo\\obj2.dat")
        );
        Bar2 bar2=new Bar2(4);
        oos3.writeObject(bar2);
        oos3.flush();
        oos3.close();

        ObjectInputStream ois3=new ObjectInputStream(
                new FileInputStream("demo\\obj2.dat")
        );
        Bar2 bar2_2=(Bar2)ois3.readObject();
        ois3.close();

/*对子类对象进行反序列化操作，
如果其父类没有实现Serializable接口
那么其父类的构造函数会被调用

若父类有实现Serializable接口
不会调用父类的构造函数

 */
    }

}
