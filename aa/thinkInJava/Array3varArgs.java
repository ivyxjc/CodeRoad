package thinkInJava;

class AAAA{}



public class Array3varArgs {
	//可变参数列表
	//0 args is also ok
	//the args will be changed into array automatically.So we can use
	//foreach to get the elements.
	public static void printArrary(Object...args){
		for(Object obj:args){
			System.out.print(obj+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String args[]){
		
		printArrary(new Integer(43),new Float(3.4));
		printArrary(33,45,22);
		printArrary(new AAAA(),new AAAA());
		printArrary((Object[])new Integer[]{1,2,3,4});
	}
}
