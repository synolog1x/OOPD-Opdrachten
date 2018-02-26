import processing.core.PApplet;

public class KlokProgramma extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "KlokProgramma" });
	}

	Klok deKlok;

	public void settings() {
		size(400, 300);
	}

	public void setup() {
		deKlok = new Klok(150, 100, 200);
		deKlok.setTijd(23, 58);
	}

	public void draw() {
		background(255);
		deKlok.tik();
		deKlok.tekenKlok(this);
		println(deKlok);
	}
}
