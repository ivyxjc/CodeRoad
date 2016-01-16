package exception;

class MyException extends Exception{
	public MyException(){};
	public MyException(String msg){
		super(msg);
	}
}

public class FullConstructor {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.out.println("Throwing MyException  from g()");
		throw new MyException("Originated in g()");
	}
	
	public static void main(String args[]){
		try{
			f();
		}catch(MyException e){
			e.printStackTrace();//Ĭ���������׼������
		}
		
	
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
			System.out.println(e.getMessage());//�������׼�������
		}
		
	}

}
