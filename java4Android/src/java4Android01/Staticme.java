package java4Android01;


class Staticme {
	static{
		System.out.println("��̬�����");
	}
	static int i=30;//������������࣬��һһ������ñ������ģ����и���Ķ���ĸñ������ᷢ���仯
	static String name;
	
	static void fun()
	{
		//��̬�����в���ֱ��ʹ�÷Ǿ�̬�ĳ�Ա����
		System.out.println("Static functions");
	}
	
	static void talk()
	{
		//ֱ��ʹ��String name�����,�����뽫name ����Ϊstatic String name
		System.out.println("my name is "+name);
	}
	

}
