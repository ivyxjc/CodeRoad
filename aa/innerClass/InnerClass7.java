package innerClass;

import innerClass.InnerClass.Inner;

public class InnerClass7 {
	private int i=1;
	
	class Inner{
		void modifyOuter(){
			i*=2;
			outerHi();
		}
	}
	
	private void outerHi(){
		System.out.println("Outer Hi");
	}
	
	
	public void showI(){
		System.out.println(i);
	}
	
	public void testInner(){
		Inner i=new Inner();
		i.modifyOuter();
	}
	
	
	public static void main(String args[]){
		 InnerClass7 out=new InnerClass7();
		 out.showI();
		 out.testInner();
		 out.showI();
		 
	}
}
