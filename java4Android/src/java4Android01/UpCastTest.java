package java4Android01;

//一个引用能调用的成员函数或者成员变量取决于它本身的类型定义
//一个引用能调用哪一个方法取决于这个引用所指向的对象

public class UpCastTest {
	public static void main(String args[]){
		
		UpCastSon p1=new UpCastSon();
		p1.address="beijing";
		p1.introduce();
		
		UpCastFather p2=p1;
		
		p2.introduce();//调用的是子类的introduce()
		//p2指向的是一个CastSon的对象
		
		//p2.study();无法调用study()

	}

}
