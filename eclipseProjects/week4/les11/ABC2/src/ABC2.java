public class ABC2 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		B b2 = new B();
		B b3 = new C();
	
		C c3 = new C();
		
	
		//C castA1naarC = (C) a1;
		//C castA2naarC = (C) a2;
		C castA3naarC = (C) a3;
		
		A castB2naarA = (A) b2;
		A castB3naarA = (A) b3;
		
		B castC3naarB = (B) c3;
		
//		castA1naarC.doA();
//		castA1naarC.doB();
//		castA1naarC.doC();
		
//		castA2naarC.doA();
//		castA2naarC.doB();
//		castA2naarC.doC();
		
		castA3naarC.doA();
		castA3naarC.doB();
		castA3naarC.doC();
		
		castB2naarA.doA();
		
		
		castB3naarA.doA();
		
		
		castC3naarB.doA();
		castC3naarB.doB();

		
		
		
	}
}
