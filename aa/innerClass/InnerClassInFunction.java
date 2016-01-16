package innerClass;

//nesting a class within a method

interface Destination {
String readLabel();
} 


public class InnerClassInFunction {
	public Destination destination(String s){
		//PDestination是destination()方法的的一部分，所以不能再destination()之外
		//不能访问PDestination。但是dest()执行完毕之后，PDestinaion仍可用，参见Parcel6.java
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
