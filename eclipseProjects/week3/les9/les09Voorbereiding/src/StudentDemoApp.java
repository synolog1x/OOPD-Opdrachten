public class StudentDemoApp {

	public static void main(String[] args) {
		Student s = new Student("han");
		System.out.println(s.getNaam());
	s.setGeslacht(Geslacht.VROUW);;
		System.out.println(s.getGeslacht());
	}

}
