package Thread;

public class Test {

	public static void main(String[] args) {
		//�����߳���Ķ���
		FirstThread ft=new FirstThread();
		//�����߳�
		ft.start();
		
		
		for(int i=0;i<1000;i++){
			System.out.println("main-->"+i);
		}
		//ft.run();��������ôд,����д�Ͳ��Ƕ��߳���
		
	}

}
