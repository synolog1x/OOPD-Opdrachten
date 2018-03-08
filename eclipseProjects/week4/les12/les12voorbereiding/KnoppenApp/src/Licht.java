import processing.core.PApplet;

public class Licht {
	private PApplet app;
	private int kleur;
	private boolean isAan;

	public Licht(PApplet app) {
		this.app = app;
		kleur = 0;
		isAan = false;
	}

	void schakelLicht() {
		if (kleur == 0) {
			kleur = 0xFFA4C739;
			isAan = true;
		} else {
			kleur = 0;
			isAan = false;
		}
	}

	public void tekenLicht() {
		app.background(kleur);
	}

	public boolean isAan() {
		return isAan;
	}

	public void setAan(boolean isAan) {
		this.isAan = isAan;
	}
}