package polymorphism;

class BB{
	public int i=0;
	
	public int  getI(){
		return i;
	}
}


class BBSon extends BB{
	public int i=1;
	
	public int getI(){
		return i;
	}
	
	public int getSuperI(){
		return super.i;
	}
}


public class FieldAccesss {
	public static void main(String args[]){
		BB b=new BBSon();
		System.out.println(b.i);
		//System.out.println(b.getSuperI());
		System.out.println(b.getI());
	}
}
