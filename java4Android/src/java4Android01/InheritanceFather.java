package java4Android01;

class InheritanceFather {
	String name;
	int age;
	
	InheritanceFather()
	{
		System.out.println("Father's no args construcotr");
	}
	
	InheritanceFather(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Father's two args constructor");
	}
	
	void eat(){
		System.out.println("eat launch");
	}
	
	void introduce(){
		System.out.println("my name is "+name+" my age is "+age);
		 
	}
	
}
