package thinkInJava;

class A
{
	@Override
	public String toString(){
		return 11+"";
	}
}


public class Array2 {
	public static void printArray(Object[] args){
		for (Object obj : args) {
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String args[]){
		printArray(new Object[]{1,2,3,4});
		printArray(new Object[]{new Integer(10),new Float(3.4)});
		printArray(new Object[]{new A(),new A()});
	}
}
