package java4Android01;
//1.在具有父子关系的两个类中
//2.父子类各有一个函数，这两个函数的定义（返回值类型，参数列表，函数名）完全相同
class OverrideSon extends Override {
	String address;
	
	void introduce()
	{
		//调用父类中的该方法
		super.introduce();
		System.out.println(" my address is "+address);
	}

	
}
