package innerClass;

public class Test {
	public static void main(String args[]){
		A a=new A();
		a.i=4;
		A.B b=a.new B();
		b.j=1;
		b.i=5;
		System.out.println(b.funB());
	}
}
