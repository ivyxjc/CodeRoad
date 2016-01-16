package java4Android01;

public class DownCastTest {

	public static void main(String args[]){
		
		DownCastFather p1=new DownCastSon();//先向上转型
		DownCastSon p2=(DownCastSon)p1; //向下转型
		
		
	}
}
