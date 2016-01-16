

public class Test {
	public static void main(String args[]){
		Printer p1=new HPPrinter();
		//Printer p2=new CanonPrinter();
		
		p1.open();
		p1.print();
		p1.close();
		
		
//		p2.open();
//		p2.print();
//		p2.close();
	}
}
