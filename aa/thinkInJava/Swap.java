package thinkInJava;

class Ins{
	
	int a;
	int b;
	
	Ins(int a,int b){
		this.a=a;
		this.b=b;
	}
}
public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
		
	}
	
	public static void run(){
		String aa=new String("abcd");
		String bb=new String("efgh");
		exchange(aa,bb);
		System.out.println(aa);
		System.out.println(bb);
		int c=9;
		int d=10;
		exchange(c, d);
		System.out.println(c);
		System.out.println(d);
		
		Ins a1=new Ins(1,2);
		Ins a2=new Ins(3,4);
		
		exchange(a1, a2);		
		System.out.println(a1.a);
		System.out.println(a2.a);
		
		Integer e1=9;
		Integer e2=10;
		exchange(e1, e2);
		System.out.println(e1);
		System.out.println(e2);
		
	}

	public static void exchange(int a,int b){
		int tmp=a;
		a=b;
		b=tmp;
	}
	
	public static void exchange(String a,String b){
		a="aaaa";
	}
	
	public static void exchange(Integer a,Integer b){
		Integer tmp=a;
		a=b;
		b=tmp;
	}
	
	
	public static void exchange(Ins a,Ins b){
		int tmp=a.a;
		a.a=b.a;
		b.a=tmp;
	}
}
