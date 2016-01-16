package polymorphism;

class A{
	public void read(){
		System.out.println("read");
	}
	
	public void write(){
		read();
		System.out.println("write");
	}
}

class ASon extends A{
	public void write(){
		System.out.println("Son write");
	}
	public void aa(){
		System.out.println("aaaa");
	}

}

public class Base  {
	public static void main(String args[]){
		A a=new ASon();
		a.write();
		a=(ASon)a;
		a.write();
		//a.aa();
	}
}
