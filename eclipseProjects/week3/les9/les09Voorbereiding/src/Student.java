public class Student {
	private String naam;
	private Geslacht geslacht;
	private int studentNr;
	
	
	private static int nStudenten = 0;
	
	public Student(String naam) {
		this.naam = naam;
		nStudenten++;
		studentNr = nStudenten;
	}
		
	public Geslacht getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(Geslacht geslacht) {
		this.geslacht = geslacht;		
	}

	public static int getNStudenten() {
		return nStudenten;
	}

	public String toString() {
		return getNaam();
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getStudentNr() {
		return studentNr;
	}

	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}

	public static int getnStudenten() {
		return nStudenten;
	}

	public static void setnStudenten(int nStudenten) {
		Student.nStudenten = nStudenten;
	}
}
