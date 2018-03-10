import java.util.ArrayList;
import processing.core.PApplet;

public class TekenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("TekenApp");
	}

	public ArrayList<Figuur> figurenLijst = new ArrayList<>();
	private SelecteerGereedschap selecteer = new SelecteerGereedschap();
	private CirkelGereedschap cirkel = new CirkelGereedschap();
	private RechthoekGereedschap rechthoek = new RechthoekGereedschap();
	private GumGereedschap gum = new GumGereedschap();
	
	private IGereedschap huidigGereedschap = cirkel;
	
	public void settings() {
		size(600, 600);
	}
	
	public void setup() {
	
	}
	
	public void draw() {
		background(0);
		for (Figuur figuur : figurenLijst) {
			figuur.teken(this);
		}
	}
	
	public void mousePressed() {
		huidigGereedschap.pasGereedschapToe(this);
	}
	
	public void keyReleased() {
		switch (key) {
			case 's':
				huidigGereedschap = selecteer;
				break;
			case 'r':
				huidigGereedschap = rechthoek;
				break;
			case 'c':
				huidigGereedschap = cirkel;
				break;
			case 'g':
				huidigGereedschap = gum;
				break;
		}
	}	
}
