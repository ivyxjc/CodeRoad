package polymorphism;


class Glyph{
	void draw(){
		System.out.println("Glyph.draw()");
	}
	
	public Glyph() {
		System.out.println("Glyph before draw()");
		draw();
		System.out.println("Glypt after draw()");
	}
}
class RoundGlyph extends Glyph{
	private int radius=1;
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		radius=r;
		System.out.println("RoundGlyph.RoundGlyph, radius= "+radius);
	}
	
	void draw(){
		System.out.println("RoundGlyph.draw(), radius="+radius);
	}
}


public class PolyConstructor {
	public static void main(String args[]){
		new RoundGlyph(5);
	}
}
