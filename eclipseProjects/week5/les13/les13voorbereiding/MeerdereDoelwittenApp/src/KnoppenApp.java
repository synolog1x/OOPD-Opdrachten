import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"KnoppenApp"});
	}
	
	private ArrayList<Knop> knoppen = new ArrayList<>();

	private Licht licht;
	private Tekstraam tekstraam;
	
	public void settings() {
		size(400, 400);	
	}
	
	public void setup() {		
		licht = new Licht(this);
		tekstraam = new Tekstraam(this,"OOPD",250,250);
		
		Switch eenSwitch=new Switch(this,100,20,50,50);
		Switch tweedeSwitch = new Switch(this, 100, 50, 50,50);
		
		eenSwitch.voegDoelwitToe(licht);
		eenSwitch.voegDoelwitToe(tekstraam);
		
		tweedeSwitch.voegDoelwitToe(licht);

		knoppen.add(eenSwitch);
		knoppen.add(tweedeSwitch);
	}
	
	public void draw() {
		licht.teken();
		tekstraam.teken();
		for (Knop k : knoppen) {
			k.tekenKnop();
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
