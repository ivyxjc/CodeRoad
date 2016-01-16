package innerClass;

//nesting a class within a method

interface Destination {
String readLabel();
} 


public class InnerClassInFunction {
	public Destination destination(String s){
		//PDestination��destination()�����ĵ�һ���֣����Բ�����destination()֮��
		//���ܷ���PDestination������dest()ִ�����֮��PDestinaion�Կ��ã��μ�Parcel6.java
		class PDestination implements Destination{
			private String label;
			
			private PDestination(String whereTo){
				label=whereTo;
			}
			
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String args[]){
		InnerClassInFunction p=new InnerClassInFunction();
		Destination d=p.destination("Tasmania");
	}
	
}
