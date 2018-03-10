import processing.core.PApplet;

public class Tekstraam extends PApplet implements IDoelwit {

	private PApplet app;
	private String tekst;
	private float x, y;
	private boolean tekenen;

	public Tekstraam(PApplet app, String tekst, float x, float y) {
		this.app = app;
		this.tekst = tekst;
		this.x = x;
		this.y = y;
		tekenen = false;
	}

	@Override
	public void schakel() {
		tekenen = !tekenen;
	}

	@Override
	public void teken() {
		if (tekenen) {
			app.text(tekst, x, y);
		}
	}

}
