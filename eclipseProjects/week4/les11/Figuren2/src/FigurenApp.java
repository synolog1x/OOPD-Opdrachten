import processing.core.PApplet;

public class FigurenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "FigurenApp" });
	}

	public void settings() {
		size(500, 500);
	}

	Figuur cirkel;
	Figuur rechthoek;

	public void setup() {
		cirkel = new Cirkel(100, 100, 50);
		rechthoek = new Rechthoek(300, 100, 50, 50);
		cirkel.setSnelheid(30, 30);
		cirkel.setVersnelling(-10, 1);
	}

	public void draw() {
		background(0);
		cirkel.teken(this);
		rechthoek.teken(this);
		
		
		cirkel.doeStap(); 
		rechthoek.setVersnelling(2, 1);
		rechthoek.setVisibility(true);

	}

}
