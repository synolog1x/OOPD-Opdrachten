import processing.core.PApplet;

public class Rechthoek extends Figuur {

	public Rechthoek(float x, float y, float breedte, float hoogte) {
		super(x, y, breedte, hoogte);

	}

	// waarom startX en startY?
	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		if (isZichtbaar) {
			app.noStroke();
			app.fill(vulKleur);
			app.rect(x, y, breedte, hoogte);
		}
	}

	
	@Override
	public boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}

}
