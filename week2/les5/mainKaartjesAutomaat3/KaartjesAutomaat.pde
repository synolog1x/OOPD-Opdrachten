class KaartjesAutomaat {
  float ingeworpenGeld;
  Kaartje[] kaartjes;

  KaartjesAutomaat() {
    kaartjes = new Kaartje[]{
      new Kaartje("FILM 1", 2.5), 
      new Kaartje("FILM 2", 3.5), 
      new Kaartje("FILM 3", 10.0)
    };
  }

  float bepaalWisselgeld(int geselecteerdKaartje) {
    if (ingeworpenGeld > kaartjes[geselecteerdKaartje].prijs) {
      return ingeworpenGeld - kaartjes[geselecteerdKaartje].prijs;
    } else return 0;
  }

  void leegAutomaat() {
    ingeworpenGeld = 0;
  }

  String drukKaartjeAf(int geselecteerdKaartje) {
    if (ingeworpenGeld > kaartjes[geselecteerdKaartje].prijs) {
      return "Hier is uw kaartje voor de film " + kaartjes[geselecteerdKaartje].film + " van €" + kaartjes[geselecteerdKaartje].prijs + "\nUw wisselgeld is: €" +  bepaalWisselgeld(geselecteerdKaartje);
    } else {
      return "gooi meer geld";
    }
  }

  void verhoogIngeworpenGeld(float inwerp) {
    if (inwerp > 0) {
      ingeworpenGeld += inwerp;
    }
  }

  
}