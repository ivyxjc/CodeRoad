package java4Android01;

public class StaticTest {
	public static void main(String args[])
	{
		//Staticme.i=10;//��̬��Ա��������ֱ��ʹ������������
		Staticme p1=new Staticme();
		Staticme p2=new Staticme();
		//Staticme.i=20;
		p1.i=10;
		System.out.println(p1.i);
		System.out.println(p2.i);
		
		Staticme.fun();
		p1.name="zhangsan";
		Staticme.talk();
	}

}
