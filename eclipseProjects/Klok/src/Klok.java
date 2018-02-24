public class Klok {
	private Teller minutenTeller;
	private Teller urenTeller;


	public Klok(KlokProgramma p, float x, float y, float breedte) {
		urenTeller = new Teller(p, 24, x, y, breedte / 2);
		minutenTeller = new Teller(p, 60, x + breedte / 2, y, breedte / 2);
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

	public void tekenKlok() {
		urenTeller.tekenTeller();
		minutenTeller.tekenTeller();

	}

	public String toString() {
		return "Het is nu: " + urenTeller.getWaarde() + ":" + minutenTeller.getWaarde();

	}
	
	public KlokProgramma getApp() {
		return urenTeller.getApp();
	}

	public void setApp(KlokProgramma app) {
		urenTeller.setApp(app);
		minutenTeller.setApp(app);
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