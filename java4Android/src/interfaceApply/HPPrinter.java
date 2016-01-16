package interfaceApply;

class HPPrinter implements Printer {
	public void open(){
		System.out.println("HP Open");
	}
	
	public void close(){
		System.out.println("HP Close");
	}
	
	public void print(String a){
		System.out.println("HP Print"+a);
	}
}
