import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
	private ArrayList<Lottobal> lottoBallen = new ArrayList<Lottobal>();

	public void verzamelAlleBallen() {
		for (int i = 0; i < 45; i++) {
			lottoBallen.add(new Lottobal(i));
		}
	}

	public Lottobal schepBal() {
		Random r = new Random();
		int randomBalNummer = r.nextInt(lottoBallen.size());
		Lottobal tijdelijkeBal = lottoBallen.get(randomBalNummer);
		lottoBallen.remove(randomBalNummer);
		return tijdelijkeBal;
	}
}
