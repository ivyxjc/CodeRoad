package Thread2;

class RunnableImpl implements Runnable {
	public void run() {
		 for(int i=0;i<100;i++)
		 {
			 System.out.println("Runnalbe-->"+i);
			 if(i==50){
				 try{
					 Thread.sleep(2000);
				 }
				 catch(Exception e){
					 System.err.println(e);
				 }
			 }
			 if(i==60){
				 try{
					 Thread.yield();
				 }
				 catch(Exception e){
					 System.err.println(e);
				 }
			 }
		 }
	}
} 


