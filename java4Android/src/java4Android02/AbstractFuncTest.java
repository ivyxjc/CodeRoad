package java4Android02;

public class AbstractFuncTest {
	public static void main(String args[]){
		AbstractFuncFather pp=new AbstractFuncSon("ssss",4);//向上转型
		pp.eat();
	}
}
