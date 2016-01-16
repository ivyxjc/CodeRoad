package Chap9Interface;


abstract class A{
	public abstract void print();
	
	public void write(){
		System.out.println("A wwww");
	}
	
	A(){
		System.out.println("1111");
	}
	
	public void baseWrite(){
		System.out.println("baseWrite()");
	}

}

class ASon extends A{
	private int i=1;
	
	public void print(){
		System.out.println(i);
	}
	
	ASon(){
		System.out.println("sssss");
	}
	
	@Override
	public void write(){
		System.out.println("ASon wwwww");
	}
	
	public void sonWrite(){
		System.out.println("sonWrite()");
	}

	
}
	


public class AbstractClass1 {
	public static void main(String args[]){
		ASon a =new ASon();
		a.print();
		a.write();
		A b=(A)a;
		b.write();
		b.baseWrite();
	}

	
}
