package Thread4;

public class MyThread2 implements Runnable {
	private MyService service;
	
	
	public MyThread2(MyService service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	
	@Override
	public void run() {
		service.fun2();
	}
}