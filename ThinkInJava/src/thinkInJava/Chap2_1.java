package thinkInJava;

class A22{
	private int i;
	private int j;
	
	A22(int i,int j){
		this.i=i;
		this.j=j;
	}
	
	public int getI(){
		return i;
	}
	
	public int getJ(){
		return j;
	}
}

class A33{
	private int k;
	private int l;
	private A22 a;
	
	A33(int k,int l,A22 a){
		this.k=k;
		this.l=l;
		this.a=a;
	}
	
	public A22 getEle(){
		return a;
	}
	
	public int getI(){
		return a.getI();
	}
	
}
public class Chap2_1 {
	public static void main(String args[]){
		A22 a=new A22(3,4);
		A33 b=new A33(1,3,a);
		//b.getEle()=a;
	}
}
