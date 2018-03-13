import processing.core.PApplet;
import java.util.ArrayList;

public class WeergaveObjectContainer extends WeergaveObject {
	ArrayList<WeergaveObject> container = new ArrayList<WeergaveObject>();
	
	public WeergaveObjectContainer(float x, float y) {
		super(x, y, 0, 0);
	}
	
	
	@Override
	public void geefMousePressedGebeurtenis(int muisX, int muisY) {
		for(WeergaveObject wo: container) {
			wo.geefMousePressedGebeurtenis(muisX, muisY);
		}
	}
	
	@Override
	public boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void doeStap() {
		for(WeergaveObject wo: container) {
			wo.doeStap();
		}
	}
	
	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		 for(WeergaveObject wo: container) {
			 wo.geefWeer(app, x, y);
		 }

	}

	public void voegToe(WeergaveObject object) {
		container.add(object);
	}
	
	public void verwijder(WeergaveObject object) {
		container.remove(object);
	}



}
