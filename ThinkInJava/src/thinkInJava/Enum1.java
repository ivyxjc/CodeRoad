package thinkInJava;

enum Spiciness{
	NOT,MILD,MEDIUM,HOT,FLAMING
}

public class Enum1 {
	public static void main(String args[]){
		Spiciness howHot=Spiciness.MEDIUM;
		System.out.println(howHot);
		
		for(Spiciness s:Spiciness.values()){
			System.out.println(s+".ordinal"+s.ordinal());
		}
	}
}
