package interfaceApply;

public class Test {
	public static void main(String args[]){
		Printer printer =null;
		//�����û���ѡ��������Ӧ�Ĵ�ӡ������
		//��������ת��ΪPrinter����
		int flag=0;
		printer=PrinterFactory.getPrinter(flag);
		
		printer.open();
		printer.print("test");
		printer.close();
	}
}
