package java4Android02;

class AbstractFuncSon extends AbstractFuncFather {
	String address;
	
	public AbstractFuncSon() {
		// TODO Auto-generated constructor stub
		System.out.println("Son's constructor");
	}
	
	public AbstractFuncSon(String name,int age) {
		// TODO Auto-generated constructor stub
		super(name,age);
		System.out.println("Son's constructor");
	}
	
	@Override
	void eat(){
		System.out.println("using chopsticks");
	}
	
}
