package Thread2;

public class Test {

	public static void main(String[] args) {
		RunnableImpl ri=new RunnableImpl();
		
		//生成一个Thread对象，并将Runnable接口实现类的对象作为参数
		//传递给该Thread对象
		Thread t=new Thread(ri);
		//通知Thread对象，实行start方法
		
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		//线程优先级最大为10，最小为1，可以使用Thread所提供的静态常量来设置
		//优先级
		
		System.out.println(t.getPriority());
		for(int i=0;i<100;i++)
			System.out.println("Main-->"+i);
	}

}
