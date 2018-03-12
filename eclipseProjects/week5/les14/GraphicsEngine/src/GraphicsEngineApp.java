import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "GraphicsEngineApp" });
	}

	ArrayList<WeergaveObject> weergaveLijst = new ArrayList<WeergaveObject>();
	Rechthoek rechthoek1 = new Rechthoek(50, 50, 100, 100);
	HalloReageerder hr = new HalloReageerder();

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		rechthoek1.voegReageerderToe(hr);
		weergaveLijst.add(rechthoek1);
	}

	public void draw() {
		for (WeergaveObject object : weergaveLijst) {
			object.geefWeer(this, 0, 0);
		}
	}

	public void mousePressed() {
		for (WeergaveObject object : weergaveLijst) {
			object.geefMousePressedGebeurtenis(mouseX, mouseY);
		}
	}

}
