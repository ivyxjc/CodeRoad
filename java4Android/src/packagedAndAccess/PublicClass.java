package packagedAndAccess;
//public:
//private:
//protected:
//

//public可以修饰类，成员变量和成员函数
//没有任何限制，同一个包中，或者不同包当中的类都可以自由访问

//private可以修饰成员变量和成员函数
//只能在本类中使用

//default(不写权限修饰符，就是default权限）可以修饰类，成员变量和成员函数
//在同一个包中，可以自由访问
//子类无法跨包访问

//protected权限拥有和default拥有相同的功能，但是该权限只能修饰成员变量和成员函数
//子类可以跨包访问

//权限排名：
//public>protected>default>private

public class PublicClass {
	
}
