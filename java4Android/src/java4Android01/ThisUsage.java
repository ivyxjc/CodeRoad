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
		this(name,age);//���ñ����е�����һ�����캯��,�����ڹ��캯���ĵ�һ��
		this.address=address;
		System.out.println("three args constructor");
	}
	
	void talk()
	{
		//���ó�Ա�����ʱ��Ӧ��ʹ�á�����.��Ա���ĸ�ʽ
		System.out.println("my name is "+name);
		System.out.println("nnnnnnn is "+this.name);
		System.out.println("--------------------");
	}
}
