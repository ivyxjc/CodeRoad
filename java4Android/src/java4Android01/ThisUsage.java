package java4Android01;

class ThisUsage {
	String name;
	int age;
	String address;
	
	ThisUsage()
	{
		System.out.println("no args constructor");
	}
	

	
	ThisUsage(String name ,int age)
	{
		this();
		this.name=name;
		this.age=age;
		System.out.println("two args constructor");
	}
	
	ThisUsage(String name,int age,String address)
	{
		this(name,age);//调用本类中的另外一个构造函数,必须在构造函数的第一行
		this.address=address;
		System.out.println("three args constructor");
	}
	
	void talk()
	{
		//调用成员对象的时候，应该使用“对象.成员”的格式
		System.out.println("my name is "+name);
		System.out.println("nnnnnnn is "+this.name);
		System.out.println("--------------------");
	}
}
