package Thread;

public class Test {

	public static void main(String[] args) {
		//生成线程类的对象
		FirstThread ft=new FirstThread();
		//启动线程
		ft.start();
		
		
		for(int i=0;i<1000;i++){
			System.out.println("main-->"+i);
		}
		//ft.run();不可以这么写,这样写就不是多线程了
		
	}

}
