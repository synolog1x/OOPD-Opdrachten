
public class GumGereedschap implements IGereedschap {

	@Override
	public void pasGereedschapToe(TekenApp app) {
	
		for (int i = app.figurenLijst.size() - 1; i >= 0; i--) {
			Figuur fig = app.figurenLijst.get(i);
			if (fig.isMuisBinnen(app.mouseX, app.mouseY)) {
				app.figurenLijst.remove(i);
			}
		}
	}

}
