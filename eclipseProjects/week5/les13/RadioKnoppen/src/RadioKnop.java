import processing.core.PApplet;

public class RadioKnop extends Switch implements IDoelwit{
	
	
	public RadioKnop(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app, x, y, breedte, hoogte);
	}
	
	
	@Override
	public void tekenKnop() {
		app.ellipseMode(PApplet.CENTER);
		app.noStroke();
		app.fill(255);
		app.ellipse(x, y, breedte, hoogte);
		if (isAan) {
			app.fill(0);
			app.ellipse(x, y, breedte - breedte/4, hoogte - hoogte/4);
		}
	}
	
	@Override 
	public boolean isMuisOverKnop() {
		if (PApplet.dist(app.mouseX, app.mouseY, x, y) < breedte/2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void handelInteractieAf() {
		schakel();
	}
	
	@Override
	public void schakel() {
		isAan = true;
		for(IDoelwit d: doelWitten) {
			if(d != this) {
				RadioKnop rk = (RadioKnop) d;
				rk.isAan = false;
			}
		}
	}

}
