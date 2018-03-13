import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "GraphicsEngineApp" });
	}

	
	//ArrayList<WeergaveObject> weergaveLijst = new ArrayList<WeergaveObject>();
	Rechthoek rechthoek1 = new Rechthoek(50, 50, 100, 100);
	Rechthoek rechthoek2 = new Rechthoek(100,200, 10,20);
	HalloReageerder hr = new HalloReageerder();
	SnelheidReageerder sr = new SnelheidReageerder();
	WeergaveObjectContainer woc = new WeergaveObjectContainer(30,30);
	
	public void settings() {
		size(500, 500);
	}

	public void setup() {
		rechthoek1.voegReageerderToe(hr);
		rechthoek1.voegReageerderToe(sr);
		rechthoek2.voegReageerderToe(hr);
		woc.voegToe(rechthoek1);
		woc.voegToe(rechthoek2);
	}

	public void draw() {
		background(0);
//		for (WeergaveObject object : weergaveLijst) {
//			object.geefWeer(this, 0, 0);
//		}
//		
		woc.geefWeer(this, 0,100);
		woc.doeStap();
	}

	public void mousePressed() {
//		for (WeergaveObject object : weergaveLijst) {
//			object.geefMousePressedGebeurtenis(mouseX, mouseY);
//		}
	
	woc.geefMousePressedGebeurtenis(mouseX, mouseY);
	}

}
