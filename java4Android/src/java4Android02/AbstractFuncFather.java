package java4Android02;

//1.�����಻�ܹ����ɶ���
//2.���һ�������г���������ô��Ҳ�豻����Ϊ������
//3.���һ������û�г������������Ҳ���Ա�����Ϊ������

//���������ӵ�й��캯��

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
