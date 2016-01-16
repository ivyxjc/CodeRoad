package innerClass;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

class AnnoyAAAA{
	
	public int value(){return 0;}
	public AnnoyAAAA(int i) {
		
	}
}

public class AnnoyInnerClass {
	public  AnnoyAAAA aaaa(int x){
		return new AnnoyAAAA(x){
			private int i=1;
			public int value(){
				return i;
			}
			
		};
	}
	
	public static void main(String args[]){
		AnnoyInnerClass aic=new AnnoyInnerClass();
		AnnoyAAAA a=aic.aaaa(1);
		System.out.println(a.value());
	}
}
