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

	public void doeStap() {

	}

	public abstract void geefWeer(PApplet app, float startX, float startY);

	protected abstract boolean isMuisBinnen(int muisX, int muisY);

	public void geefMousePressedGebeurtenis(int muisX, int muisY) {
		if (isMuisBinnen(muisX, muisY)) {
			for (IReageerder reageerder : reageerdersLijst) {
				reageerder.doeActie();
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

}
