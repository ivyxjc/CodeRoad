package java4Android01;

//һ�������ܵ��õĳ�Ա�������߳�Ա����ȡ��������������Ͷ���
//һ�������ܵ�����һ������ȡ�������������ָ��Ķ���

public class UpCastTest {
	public static void main(String args[]){
		
		UpCastSon p1=new UpCastSon();
		p1.address="beijing";
		p1.introduce();
		
		UpCastFather p2=p1;
		
		p2.introduce();//���õ��������introduce()
		//p2ָ�����һ��CastSon�Ķ���
		
		//p2.study();�޷�����study()

	}

}
