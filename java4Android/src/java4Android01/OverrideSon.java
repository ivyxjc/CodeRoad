package java4Android01;
//1.�ھ��и��ӹ�ϵ����������
//2.���������һ�������������������Ķ��壨����ֵ���ͣ������б�����������ȫ��ͬ
class OverrideSon extends Override {
	String address;
	
	void introduce()
	{
		//���ø����еĸ÷���
		super.introduce();
		System.out.println(" my address is "+address);
	}

	
}
