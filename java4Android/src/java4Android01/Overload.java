package java4Android01;

public class Overload 
{
	static void nnn()
	{
		System.out.println("nnnnnnnnnnnnnnnnnnnnnn");
	}
	static void nnn(int i)
	{
		System.out.println("iiiiiiiiiiiiiiiiii");
	}

	public static void main(String args[])
	{
		overloadA a=new overloadA();
		a.funA();
		a.funA(4);
		
		
		A b=new A();
		b.funA();
		b.funA(6);
		
	
		System.out.println("------------------");
		nnn();
		nnn(4);
	}
	

}



class A
{
	void funA()
	{
		System.out.println("nnnnnnnn");
	}
	void funA(int i)
	{
		System.out.println("yyyyyyyyyyyyy");
	}
}