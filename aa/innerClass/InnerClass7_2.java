package innerClass;

import org.omg.CORBA.SystemException;

class AAAA{
	private int i=1;
	
	class BBBB{
		private int j=11;
		public  void modifyOuter(){
			i=i*2;
			outerHi();
		}
		
		public void showInJ(){
			System.out.println(j);
		}
	}
	private void outerHi(){
		System.out.println("Outer Hi");
	}
	
	public void showI(){
		System.out.println(i);
	}
	
}

public class InnerClass7_2 {
	public static void main(String args[]){
		AAAA a=new AAAA();
		a.showI();
		a.new BBBB().modifyOuter();
		a.new BBBB().showInJ();
		a.showI();
		
	}
}
