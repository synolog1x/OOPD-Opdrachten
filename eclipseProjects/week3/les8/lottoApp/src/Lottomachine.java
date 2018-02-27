public class Lottomachine {
	Glazenbol glazenBol = new Glazenbol();
	Scorebord scoreBord = new Scorebord();

	public void voerTrekkingUit() {
		glazenBol.verzamelAlleBallen();
		scoreBord.maakLeeg();
		
		for(int i = 0; i < 6; i++) {
			Lottobal geschepteBal = glazenBol.schepBal();
			scoreBord.plaatsBal(geschepteBal);
		}
		
		Lottobal geschepteBonusBal = glazenBol.schepBal();
		scoreBord.plaatsBonusBal(geschepteBonusBal);
		
		scoreBord.sorteerBallen();
		scoreBord.printScorebord();
		
		
	}
	
	
}
