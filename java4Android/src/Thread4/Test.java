package Thread4;

public class Test {

	public static void main(String[] args) {
		MyService service=new MyService();
		
		Thread t1=new Thread(new MyThread1(service));
		Thread t2=new Thread(new MyThread2(service));
		
		t1.start();
		t2.start();
		
	}

}
