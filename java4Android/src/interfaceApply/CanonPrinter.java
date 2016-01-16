package interfaceApply;

class CanonPrinter implements Printer {
	private void clean(){
		System.out.println("Clean");
	}
	
	@Override
	public void open(){
		System.out.println("Canon Open");
	}
	
	@Override
	public void close(){
		this.clean();
		System.out.println("Canon Close");
	}
	
	@Override
	public void print(String a){
		System.out.println("Canon Print"+a);
	}
	
}
