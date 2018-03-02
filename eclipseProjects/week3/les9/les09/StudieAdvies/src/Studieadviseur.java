public class Studieadviseur {

	public static boolean krijgtPositiefStudieadvies(Student s) {
		int aantalZesOfHoger = 0;
		for (int i = 0; i < s.getCijfers().length; i++) {
			if (s.getCijfers()[i] >= 6) {
				aantalZesOfHoger++;
			}
		}
		if (aantalZesOfHoger >= 4) {
			return true;
		} else {
			return false;
		}
	}
}
