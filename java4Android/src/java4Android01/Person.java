package java4Android01;

public class Person {
	String name;
	int age;
	Person(){
	}
	//一旦有了构造函数，就不回自动添加无参构造函数
	Person(String n,int i){
		name=n;
		age=i;
	}
}
