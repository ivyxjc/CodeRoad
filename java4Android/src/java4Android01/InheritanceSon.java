package java4Android01;

class InheritanceSon extends InheritanceFather {
	//������Ĺ��캯���б�����ø���Ĺ��캯��
	int grade;
	
	InheritanceSon(){
		super();//���δ�ӣ����������Զ���
		//���ø�����Ӧ�����Ĺ��캯��
		System.out.println("Son's no args constructor");
	}
	
	InheritanceSon(String name,int age,int grade){
//		this.name=name;
//		this.age=age;
		//��super(name,age)����
		super(name,age);//���ø�����Ӧ�����Ĺ��캯��
		this.grade=grade;
	}
	
	InheritanceSon(int grade){
		this();//����InheritanceSon(),���ݲ�������������һ��
	}
	
}
