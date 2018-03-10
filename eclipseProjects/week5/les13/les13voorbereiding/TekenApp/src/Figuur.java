import processing.core.PApplet;

public abstract class Figuur {

	protected float x, y, vx, vy, ax, ay;
	protected float breedte, hoogte;
	protected int kleur;
	protected boolean visible;

	public Figuur(float x, float y, float hoogte, float breedte) {
		this.x = x;
		this.y = y;
		this.hoogte = hoogte;
		this.breedte = breedte;
		zetStil();
		kleur = 0xFFFF0000;
		visible = true;
	}

	public abstract void teken(PApplet p);
	
	public void doeStap() {
		if (!staatStil()) {
			pasVersnellingToe();
			pasSnelheidToe();
		}
	}

	public void setSnelheid(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}

	public void setVersnelling(float ax, float ay) {
		this.ax = ax;
		this.ay = ay;
	}

	public void zetStil() {
		vx = vy = ax = ay = 0;
	}

	public boolean staatStil() {
		return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
	}

	public void setKleur(int kleur) {
		this.kleur = kleur;
	}

	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}

	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}

	public void setVisibility(boolean visible) {
		this.visible = visible;
	}

	public boolean getVisibility() {
		return visible;
	}

	public boolean isMuisBinnen(int mouseX, int mouseY) {
		if(mouseX >= x && mouseX <= x+breedte && mouseY >= y && mouseY <= y+hoogte) {
			return true;
		} else {
			return false;
		}
	}

}
