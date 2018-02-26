public class Klok {
	private Teller minutenTeller;
	private Teller urenTeller;


	public Klok(float x, float y, float breedte) {
		urenTeller = new Teller(24, x, y, breedte / 2);
		minutenTeller = new Teller(60, x + breedte / 2, y, breedte / 2);
	}

	public void tik() {
		minutenTeller.tik();
		if (minutenTeller.getWaarde() == 0) {
			urenTeller.tik();
		}
	}

	public void setTijd(int uren, int minuten) {
		minutenTeller.setWaarde(minuten);
		urenTeller.setWaarde(uren);
	}

	public void tekenKlok(KlokProgramma app) {
		urenTeller.tekenTeller(app);
		minutenTeller.tekenTeller(app);

	}

	public String toString() {
		return "Het is nu: " + urenTeller.getWaarde() + ":" + minutenTeller.getWaarde();

	}

	public float getX() {
		return urenTeller.getX();
	}

	public void setX(float x) {
		urenTeller.setX(x);
		minutenTeller.setX(x + urenTeller.getBreedte());
	}

	public float getY() {
		return urenTeller.getY();
	}

	public void setY(float y) {
		urenTeller.setY(y);
		minutenTeller.setY(y);
	}

	public float getHoogte() {
		return urenTeller.getHoogte();
	}

	public void setHoogte(float hoogte) {
		urenTeller.setHoogte(hoogte);
		minutenTeller.setHoogte(hoogte);
	}

	public float getBreedte() {
		return urenTeller.getBreedte();
	}

	public void setBreedte(float breedte) {
		urenTeller.setBreedte(breedte/2);
		minutenTeller.setBreedte(breedte/2);
	}

}