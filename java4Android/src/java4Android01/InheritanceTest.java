package java4Android01;

public class InheritanceTest {

	public static void main(String[] args) {
		InheritanceSon sss=new InheritanceSon();
		sss.name="zhangsan";
		sss.age=20;
		sss.eat();
		System.out.println(sss.age);
		System.out.println("-----------------");
		//sss.grade=4;
		//sss.study();
		//System.out.println(sss.grade);
		InheritanceSon bbb=new InheritanceSon("lisi",22,6);
		bbb.introduce();
	}

}
 