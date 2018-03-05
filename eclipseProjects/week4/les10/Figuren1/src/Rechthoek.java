import processing.core.PApplet;

public class Rechthoek extends Figuur {

	public Rechthoek(float x, float y, float breedte, float hoogte) {
		super(x, y, breedte, hoogte);

	}

	public void tekenRechthoek(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		if (visible) {
			p.rect(x, y, breedte, hoogte);
		}
	}
}
