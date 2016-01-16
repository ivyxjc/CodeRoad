package thinkInJava;

class AA{
	static String a1="aaaa";
	static String a2;
	static{
		a2="bbbbb";
	}
	static void print(){
		System.out.println(a1);
		System.out.println(a2);
	}
}


public class StaticBlock2 {
	public static void main(String args[]){
		AA.print();
	}

}
