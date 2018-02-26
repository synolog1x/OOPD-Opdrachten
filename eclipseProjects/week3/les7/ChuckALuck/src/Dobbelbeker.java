public class Dobbelbeker {
	Dobbelsteen[] dobbelStenen;
			
	public Dobbelbeker(int numberOfDice) {
		this.dobbelStenen = new Dobbelsteen[numberOfDice];
		for(int i=0; i<dobbelStenen.length;i++) {
			dobbelStenen[i] = new Dobbelsteen();			
		}		
	}
	
	public void dobbel() {
		for(int i = 0; i < dobbelStenen.length; i++) {
			dobbelStenen[i].dobbel();			
		}
	}
	
	public String toString() {
		String tmp="";
		for(Dobbelsteen steen: dobbelStenen) {
			tmp += " "+steen.getLaatstGedobbeld();
		}		
		return "U heeft gegooid:"+tmp;
	}
	
}