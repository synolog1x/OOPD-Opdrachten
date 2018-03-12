import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "KnoppenApp" });
	}

	private ArrayList<RadioKnop> radioKnoppen = new ArrayList<RadioKnop>();

	public void settings() {
		size(400, 400);
	}

	public void setup() {
		RadioKnop radio1 = new RadioKnop(this, 50, 50, 50, 50);
		RadioKnop radio2 = new RadioKnop(this, 100, 50, 50, 50);
		RadioKnop radio3 = new RadioKnop(this, 150, 50, 50, 50);
		
		
		
		radio1.voegDoelwitToe(radio2);
		radio1.voegDoelwitToe(radio3);
		radio2.voegDoelwitToe(radio1);
		radio2.voegDoelwitToe(radio3);
		radio3.voegDoelwitToe(radio1);
		radio3.voegDoelwitToe(radio2);
		
		radioKnoppen.add(radio1);
		radioKnoppen.add(radio2);
		radioKnoppen.add(radio3);
		
		
	}

	public void draw() {
		background(0);
		for (Knop k : radioKnoppen) {
			k.tekenKnop();
		}
	}

	public void mousePressed() {
		for (Knop k : radioKnoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}
