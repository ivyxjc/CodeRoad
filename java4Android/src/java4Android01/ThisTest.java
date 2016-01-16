package java4Android01;

public class ThisTest {
	public static void main(String args[])
	{
		ThisUsage p1=new ThisUsage();
		ThisUsage p2=new ThisUsage();
		
		p1.name="ooooo";
		p2.name="tttttt";
		p1.talk();
		p2.talk();
		
		ThisUsage q1=new ThisUsage("asdf",3,"bbbb");
	}
}
