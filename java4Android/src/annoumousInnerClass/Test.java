package annoumousInnerClass;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {
	public static void main(String args[]){
//		AImplement aI=new AImplement();
//		A a=aI;
		
		
		B b=new B();
		b.fun(new A(){
			public void doSomething(){
				System.out.println("匿名内部类");
			}
		});
		
	}
}
