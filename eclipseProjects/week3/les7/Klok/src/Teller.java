public class Teller {
	private int maximum, waarde;
	private float x, y, breedte, hoogte;
	private KlokProgramma app;

	public Teller(KlokProgramma p, int maximum, float x, float y, float breedte) {
		this.maximum = maximum;
		setWaarde(0);
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = breedte * 0.8f;
		app = p;
	}


	public void tik() {
		setWaarde((getWaarde() + 1) % maximum);

	}

	public String geefTijdNotatie() {
		if (getWaarde() < 10) {
			return "0" + getWaarde();
		} else {
			return "" + getWaarde();
		}

	}

	public void tekenTeller() {
		app.rectMode(app.CENTER);
		app.noStroke();
		app.fill(0);
		app.rect(x, y, breedte, hoogte);

		app.fill(255);
		app.textSize(hoogte);
		app.textAlign(app.CENTER);
		float verschuiving = (app.textAscent() - app.textDescent()) /2;
		app.text(geefTijdNotatie(), x, y+verschuiving);

	}
	
	public KlokProgramma getApp() {
		return app;
	}

	public void setApp(KlokProgramma app) {
		this.app = app;
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		if (waarde >= 0 && waarde < maximum) {
			this.waarde = waarde;
		}
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}

	public float getHoogte() {
		return hoogte;
	}

	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}
}