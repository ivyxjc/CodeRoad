package Thread2;

public class Test {

	public static void main(String[] args) {
		RunnableImpl ri=new RunnableImpl();
		
		//����һ��Thread���󣬲���Runnable�ӿ�ʵ����Ķ�����Ϊ����
		//���ݸ���Thread����
		Thread t=new Thread(ri);
		//֪ͨThread����ʵ��start����
		
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		//�߳����ȼ����Ϊ10����СΪ1������ʹ��Thread���ṩ�ľ�̬����������
		//���ȼ�
		
		System.out.println(t.getPriority());
		for(int i=0;i<100;i++)
			System.out.println("Main-->"+i);
	}

}
