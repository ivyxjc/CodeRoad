package java4Android01;

//�����ת�� ��Ϊ
//1.����ת��  ������Ķ���ֵ�����������
//2.����ת��  

class UpCastSon extends UpCastFather {
	
	String address;
	
	void study(){
		System.out.println("Studdduuu");
	}
	
	void introduce()
	{
		super.introduce();
		System.out.println("my home is in "+address);
	}
	
}
