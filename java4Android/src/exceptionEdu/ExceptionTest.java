package exceptionEdu;

public class ExceptionTest {
	public static void main(String args[]){
		System.out.println(1);
		try{
			System.out.println(2);
			int i=1/0 ;
			System.out.println(3);
		}
		catch(Exception e){
			System.out.println(4);
			e.printStackTrace();
			System.out.println(6);
		}
		finally{
			System.out.println("finally");
		}
		
		
		
		System.out.println(5);
	}

}
