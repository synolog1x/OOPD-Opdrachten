package les08Voorbereiding;

import java.util.ArrayList;

public class mainLes08Voorbereiding {

	public static void main(String[] args) {

//		
//		opgaveA();
//		opgaveC();
	 opgaveForEach();
		
	}

	public static void opgaveA() {
		ArrayList<String> lijst = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			lijst.add("element: " + i);
		}
		
		
		
		for (int i = 0; i < lijst.size(); i++) {
			String s = lijst.get(i);
			lijst.remove(s);
		}

		for(int i = 0; i < lijst.size(); i++) {
			System.out.println(lijst.get(i));
		}
		
	}
	
	public static void opgaveC() {
		ArrayList<String> lijstB = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			lijstB.add("element: " + i);
		}
		for(int i = lijstB.size(); i > 0; i--) {
			lijstB.remove(i-1);
		}
		for(int i = 0; i < lijstB.size(); i++) {
			System.out.println(lijstB.get(i));
		}
	
	}
	
	public static void opgaveForEach() {
		ArrayList<String> lijstC = new ArrayList<String>();
		for(int i = 0; i < 4; i++) {
			lijstC.add("Element: " + i);			
		}
		
	//KAN NIET
		for(String element: lijstC) {
			String s = element;
			lijstC.remove(s);
		}
		
	
		for(int i = 0; i < lijstC.size(); i++) {
			System.out.println(lijstC.get(i));
		}
	}
	
}
