package innerClass;

import java.util.zip.Inflater;

class A {
	int i;
	class B{
		int i;
		int j;
		
		
		int funB(){
			int result =A.this.i+this.j;
			return result;
			
		}
	}
}
