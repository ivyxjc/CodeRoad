package java4Android01;

//对象的转型 分为
//1.向上转型  将子类的对象赋值给父类的引用
//2.向下转型  

class UpCastSon extends UpCastFather {
	
	String address;
	
	void study(){
		System.out.println("Studdduuu");
	}
	
	void introduce()
	{
		super.introduce();
		System.out.println("my home is in "+address);
	}
	
}
