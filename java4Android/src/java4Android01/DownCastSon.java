package java4Android01;

class DownCastSon extends DownCastFather {

	String address;
	
	void introduce(){
		super.introduce();
		System.out.println("my address is "+address);
	}
}
