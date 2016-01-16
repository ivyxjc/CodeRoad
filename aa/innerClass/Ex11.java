package innerClass;

interface Ex11Interface{
	void say(String s);
}

class Test {
	public class Inner implements Ex11Interface {
		public void say(String s) {
			System.out.println(s); 
		}
	}
	Ex11Interface f() {
		return new Inner();
	}
}
public class Ex11 {	
	public static void main(String[] args) {
		Test t = new Test();
		t.f().say("hi");
		// Error: cannot find symbol: class Inner:
		//(Inner)t.f()).say("hello");
		((Test.Inner)t.f()).say("hello");
		//if Inner is private ,Test.Inner will be invisible
	} 
}
