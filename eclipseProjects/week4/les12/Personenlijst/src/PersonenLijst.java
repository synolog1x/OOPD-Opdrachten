import java.util.ArrayList;

public class PersonenLijst {
	private ArrayList<Persoon> lijst;

	public PersonenLijst() {
		lijst = new ArrayList<>();
	}

	public ArrayList<Persoon> getSLBStudenten(Persoon SLBer) {
		ArrayList<Persoon> studentenLijst = new ArrayList<Persoon>();
		for (Persoon p : lijst) {
			if (p.getSLBer() == SLBer) {
				studentenLijst.add(p);
			}
		}
	

	return studentenLijst;

	}

	public static void main(String[] args) {
		PersonenLijst p = new PersonenLijst();
		Persoon piet = new Docent("Piet", "Jansen", "jnsnp");
		Persoon marie = new Student("Marie", "Pieters", 31415, piet);
		Persoon klaas = new Student("Klaas", "de Rood", 21817218, piet);
		Persoon jan = new Student("Jan", "de Vries", 92653, null); // nog geen SLB’er
		p.lijst.add(piet);
		p.lijst.add(marie);
		p.lijst.add(jan);
		p.lijst.add(klaas);
		// voeg zelf nog enkele docenten en studenten toe
		ArrayList<Persoon> studentenVanPiet = p.getSLBStudenten(piet);
		System.out.println(studentenVanPiet);
	}
}
