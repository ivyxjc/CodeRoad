package java4Android01;

class Test {
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.name="dddd";
		d.age=2;
		d.color="white";
		
		Dog b=new Dog();
		b.name="bbbb";
		b.age=6;
		b.color="black";
		b.jump();
		System.out.println("Name is"+b.name);
		
	}
}
