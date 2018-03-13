
public class SnelheidReageerder implements IReageerder {

	@Override
	public void doeActie(WeergaveObject weergaveObject) {
		weergaveObject.setSnelheid(3, 3);

	}

}
