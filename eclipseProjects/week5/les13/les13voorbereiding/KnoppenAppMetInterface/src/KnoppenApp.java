import java.util.ArrayList;

import processing.core.PApplet;

public class KnoppenApp extends PApplet {
	public static void main(String[] args) {
		PApplet.main("KnoppenApp");
	}

	private Licht licht;

	private ArrayList<Knop> knoppen = new ArrayList<>();

	public void settings() {
		size(400, 400);
	}

	public void setup() {

		licht = new Licht(this);

		knoppen.add(new DoelwitKnop(this, licht, 20, 20, 50, 50));
		knoppen.add(new DoelwitSwitch(this, licht, 100, 100, 40, 20));
	}

	public void draw() {
		licht.tekenLicht();
		for (Knop k : knoppen) {
			k.tekenKnop();
			k.veranderKnopStatus();
		}
	}

	public void mousePressed() {
		for (Knop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}
