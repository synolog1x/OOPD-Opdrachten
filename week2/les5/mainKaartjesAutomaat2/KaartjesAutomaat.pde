class KaartjesAutomaat {
  float ingeworpenGeld;
  int geselecteerdKaartje;
  Kaartje[] kaartjes;

  KaartjesAutomaat() {
    kaartjes = new Kaartje[]{
      new Kaartje("FILM 1", 2.5), 
      new Kaartje("FILM 2", 3.5), 
      new Kaartje("FILM 3", 10.0)
    };
  }

  float bepaalWisselgeld() {
    if (ingeworpenGeld > kaartjes[geselecteerdKaartje].prijs) {
      return ingeworpenGeld - kaartjes[geselecteerdKaartje].prijs;
    } else return 0;
  }

  void leegAutomaat() {
    ingeworpenGeld = 0;
  }

  String drukKaartjeAf() {
    if (ingeworpenGeld > kaartjes[geselecteerdKaartje].prijs) {
      return "Hier is uw kaartje voor de film " + kaartjes[geselecteerdKaartje].film + " van €" + kaartjes[geselecteerdKaartje].prijs + "\nUw wisselgeld is: €" +  bepaalWisselgeld();
    } else {
      return "gooi meer geld";
    }
  }

  void verhoogIngeworpenGeld(float inwerp) {
    if (inwerp > 0) {
      ingeworpenGeld += inwerp;
    }
  }

  void selecteerKaartje(int kaartje) {
    if (kaartje <= kaartjes.length) {
      geselecteerdKaartje = kaartje;
    }
  }
}