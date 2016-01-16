package inheritanceApply;

abstract class Printer {

	void open(){
		System.out.println("ooooo");
	}
	
	void print(String s)
	{
		System.out.println("print -->"+s);
	}
	
	void close()
	{
		System.out.println("cccccccccccc");
	}
}
