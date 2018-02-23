
public class Programma {
public static void main(String[] args) {
	
	System.out.println("HALLO WERELD");
	School deSchool = new School("ICA");
	  
	  Student s1 = new Student("Emiel", 1, deSchool);
	  Student s2 = new Student("Valérie", 2, deSchool);
	  Student s3 = new Student("Sander",3, deSchool);

System.out.println(s1.getNaam());
System.out.println(s2.getNaam());
System.out.println(s3.getNaam());
}
	
}
