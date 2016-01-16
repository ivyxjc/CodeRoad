package interfaceApply;

public class Test {
	public static void main(String args[]){
		Printer printer =null;
		//根据用户的选择生成相应的打印机对象
		//并且向上转型为Printer类型
		int flag=0;
		printer=PrinterFactory.getPrinter(flag);
		
		printer.open();
		printer.print("test");
		printer.close();
	}
}
