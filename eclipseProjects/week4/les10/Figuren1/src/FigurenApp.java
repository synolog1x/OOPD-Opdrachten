import processing.core.PApplet;

public class FigurenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "FigurenApp" });
	}

	public void settings() {
		size(500, 500);
	}

	Cirkel cirkel;
	Rechthoek rechthoek;

	public void setup() {
		cirkel = new Cirkel(100, 100, 50);
		rechthoek = new Rechthoek(300, 100, 50, 50);
	}

	public void draw() {
		background(0);
		cirkel.tekenCirkel(this);
		rechthoek.tekenRechthoek(this);
		cirkel.setVersnelling(1, 1);
		cirkel.doeStap();
		rechthoek.setVersnelling(2, 1);
		rechthoek.setVisibility(true);

	}

}
