package java4Android01;

public class OverrideTest {

	public static void main(String[] args) {
		
		OverrideSon s=new OverrideSon();
		
		s.name="уехЩ";
		s.age=20;
		s.address="beijing";
		
		s.introduce();
		
		
		Override p=new Override();
		
		p.name="lisi";
		p.age=30;
		p.introduce();
	}

}
