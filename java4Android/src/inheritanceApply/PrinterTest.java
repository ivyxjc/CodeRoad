package inheritanceApply;

public class PrinterTest {
	public static void main(String args[]){

		int flag=0;
		flag=1;
		
		if(flag==0){
			HPPrinter hpPrinter = new HPPrinter();
			hpPrinter.open();
			hpPrinter.print("hhhhh");
			hpPrinter.close();
		}
		else if (flag==1)
		{
			CanonPrinter canonPrinter =new CanonPrinter();
			canonPrinter.open();
			canonPrinter.print("cccccccccc");
			canonPrinter.close();
			
		}
	}
}
