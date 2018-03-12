
public abstract class Figuur extends WeergaveObject {

	protected int vulKleur;

	public Figuur(float x, float y, float breedte, float hoogte) {
		super(x, y, breedte, hoogte);

		zetStil();
		vulKleur = 0xFFFFFFFF;
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

	public int getVulKleur() {
		return vulKleur;
	}

	public void setVulKleur(int vulKleur) {
		this.vulKleur = vulKleur;
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
