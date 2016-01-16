package thinkInJava;

public class Swap1 {
	public static void main(String args[]){
		int [] a={1,2,3,4,5,6};
		swap(a, 1, 5);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	
	static void swap(int [] aa,int a,int b){
		
		int tmp=aa[a];
		aa[a]=aa[b];
		aa[b]=tmp;
		
	}
}
