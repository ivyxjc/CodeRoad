package java4Android01;


class Staticme {
	static{
		System.out.println("静态代码块");
	}
	static int i=30;//这个变量属于类，任一一个对象该变量更改，所有该类的对象的该变量都会发生变化
	static String name;
	
	static void fun()
	{
		//静态函数中不能直接使用非静态的成员变量
		System.out.println("Static functions");
	}
	
	static void talk()
	{
		//直接使用String name会出错,所以须将name 设置为static String name
		System.out.println("my name is "+name);
	}
	

}
