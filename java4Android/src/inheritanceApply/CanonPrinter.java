package inheritanceApply;

//
//class CanonPrinter {
//	void open(){
//		System.out.println("Open");
//	}
//	
//	void close(){
//		this.clear();
//		System.out.println("close");
//	}
//	
//	void print(String s){
//		System.out.println("print->>"+s);
//	}
//
//	void clear(){
//		System.out.println("clear");
//	}
//}

class CanonPrinter extends Printer{
	void clean(){
		System.out.println("clearn");
	}
	void close(){
		this.clean();
		super.close();
	}
}