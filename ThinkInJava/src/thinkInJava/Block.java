package thinkInJava;

import java.awt.print.PrinterGraphics;

class Mug{
	Mug(int marker){
		System.out.println("Mug("+marker+")");
	}
	
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}

class Block{
	Mug mug1;
	Mug mug2;
	Mug mug3=new Mug(3);
	{
		mug1=new Mug(1);
		mug2=new Mug(2);
		System.out.println("mug1&mug2 initialized");
	}
	Block(){
		System.out.println("Mugs()");
	}
	Block(int i){
		System.out.println("Mugs(int)");
	}
	public static void main(String args[]){
		System.out.println("Inside main()");
		new Block();
		System.out.println("new Mugs() completed");
		new Block(2);
		System.out.println("new Mugs(2) completed");
	}
	
	
	
}

