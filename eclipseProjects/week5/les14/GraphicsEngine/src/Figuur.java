
public abstract class Figuur extends WeergaveObject {

	protected int vulKleur;

	public Figuur(float x, float y, float breedte, float hoogte) {
		super(x, y, breedte, hoogte);

		zetStil();
		vulKleur = 0xFFFFFFFF;
	}

	
	public int getVulKleur() {
		return vulKleur;
	}

	public void setVulKleur(int vulKleur) {
		this.vulKleur = vulKleur;
	}



}
