import oopd.les06.School;

public class Student {
	  private String naam;
	  private int nummer;
	  private School school;
	  
	  public Student(String naam, int nummer, School school) {
	    this.setNaam(naam);
	    this.nummer = nummer;
	    this.school = school;
	  }

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

}
