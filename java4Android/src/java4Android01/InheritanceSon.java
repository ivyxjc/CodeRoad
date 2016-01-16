package java4Android01;

class InheritanceSon extends InheritanceFather {
	//在子类的构造函数中必须调用父类的构造函数
	int grade;
	
	InheritanceSon(){
		super();//如果未加，编译器会自动加
		//调用父类相应参数的构造函数
		System.out.println("Son's no args constructor");
	}
	
	InheritanceSon(String name,int age,int grade){
//		this.name=name;
//		this.age=age;
		//用super(name,age)代替
		super(name,age);//调用父类相应参数的构造函数
		this.grade=grade;
	}
	
	InheritanceSon(int grade){
		this();//调用InheritanceSon(),根据参数决定调用哪一个
	}
	
}
