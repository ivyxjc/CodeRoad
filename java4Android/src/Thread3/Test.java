package Thread3;

public class Test {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		
		//��������Thread���󣬵���������Thread������ͬһ���߳���
		Thread t1=new Thread(myThread);
		Thread t2=new Thread(myThread);
		
		//ÿһ���̶߳������֣�����ͨ��Thread�����setName������������
		//�߳����֣�Ҳ����ʹ��getName()������ȡ����
		
		 
		t1.setName("�߳�a");
		t2.setName("�߳�b");
		
		t1.start();
		t2.start();
	}

}
