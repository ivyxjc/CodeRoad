package java4Android02;

//1.抽象类不能够生成对象
//2.如果一个类中有抽象函数，那么类也需被定义为抽象类
//3.如果一个类中没有抽象函数，这个类也可以被定义为抽象类

//抽象类可以拥有构造函数

abstract class AbstractFuncFather {
	String name;
	int age;
	
	public AbstractFuncFather() {
		// TODO Auto-generated constructor stub
		System.out.println("Father's constructor");
	}
	
	public AbstractFuncFather(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		System.out.println("Father's constructor");
		System.out.println("my name is "+name+" my age is "+age);
	}
	
	void introduce(){
		System.out.println("my name is "+name+" my age is "+age);
	}
	
	abstract void eat();
	
}
