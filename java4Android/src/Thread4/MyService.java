package Thread4;

class MyService {
	public synchronized void fun1(){
			try{
				Thread.sleep(1*1000);
			}
			catch(Exception e){
				System.err.println(e);
			}
			System.out.println("fun1");
		
	}
	
	public void fun2(){
		synchronized (this){ 
			System.out.println("fun2");		
		}
	}
}
