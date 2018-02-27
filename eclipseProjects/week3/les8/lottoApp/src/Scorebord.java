import java.util.ArrayList;

public class Scorebord {
	ArrayList<Lottobal> scoreBordBallen = new ArrayList<Lottobal>();
	Lottobal bonusBal;

	public void maakLeeg() {
		for(int i = scoreBordBallen.size(); i > 0; i--) {
			scoreBordBallen.remove(i);
			bonusBal = null;
		}
	}
	
	public void plaatsBal(Lottobal bal) {
		scoreBordBallen.add(bal);
	}
	
	public void plaatsBonusBal(Lottobal bal) {
		bonusBal = bal;
	}
	
	
	public void sorteerBallen() {
		for (int i = scoreBordBallen.size(); i > 0; i--) {
			for (int j = 0; j < i-1; j++) { 
	            if (scoreBordBallen.get(j).getBalNummer() > scoreBordBallen.get(j+1).getBalNummer()) {
	            	Lottobal bal = scoreBordBallen.get(j);
	            	scoreBordBallen.set(j, scoreBordBallen.get(j + 1));
	            	scoreBordBallen.set(j + 1, bal);
	            }
	        }
		}

	
	}
	
	public void printScorebord() {
		String uitvoer = "Trekking ";
		for(int i = 0; i < scoreBordBallen.size(); i++) {
			uitvoer += scoreBordBallen.get(i) + " ";
		}
		System.out.println(uitvoer);
		System.out.println(bonusBal);
	}
	
}
