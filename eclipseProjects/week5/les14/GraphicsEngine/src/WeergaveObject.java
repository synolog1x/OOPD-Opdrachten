import java.util.ArrayList;

import processing.core.PApplet;

public abstract class WeergaveObject {
	protected float x, y, vx, vy, ax, ay;
	protected float breedte, hoogte;
	protected boolean isZichtbaar;
	protected ArrayList<IReageerder> reageerdersLijst = new ArrayList<IReageerder>();

	public WeergaveObject(float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		isZichtbaar = true;
	}

	public abstract void geefWeer(PApplet app, float startX, float startY);

	protected abstract boolean isMuisBinnen(int muisX, int muisY);

	public void geefMousePressedGebeurtenis(int muisX, int muisY) {
		if (isMuisBinnen(muisX, muisY)) {
			for (IReageerder reageerder : reageerdersLijst) {
				reageerder.doeActie(this);
			}
		}
	}

	protected void behandelMousePressedGebeurtenis() {

	}

	public void voegReageerderToe(IReageerder reageerder) {
		reageerdersLijst.add(reageerder);
	}

	public void verwijderReageerderToe(IReageerder reageerder) {
		reageerdersLijst.remove(reageerder);
	}

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

	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}

	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}

}
