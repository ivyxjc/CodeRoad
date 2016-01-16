package Thread4;

public class MyThread1 implements  Runnable {
	private MyService service;
	
	
	public MyThread1(MyService service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	
	@Override
	public void run() {
		service.fun1();
	}
}