package Thread3;

class MyThread implements Runnable{
	int i=100;
	public void run(){
		while(true){
			//同步代码块
			synchronized (this) {
				//Threa.currentThread();获取当前代码在哪个线程中运行
				System.out.println(Thread.currentThread().getName()+i);
				i--;
				Thread.yield();
				if(i<0){
					break;
				}
			}
		}
	}
}
