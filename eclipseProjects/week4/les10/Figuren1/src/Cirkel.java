import processing.core.PApplet;

public class Cirkel extends Figuur {

	public Cirkel(float x, float y, float diameter) {
		super(x, y, diameter, diameter);
	}

	public void tekenCirkel(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		if (visible) {
			p.ellipse(x, y, breedte, hoogte);
		}
	}

}
