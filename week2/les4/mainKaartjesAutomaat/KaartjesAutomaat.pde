class KaartjesAutomaat {
  float prijs, ingeworpenGeld;
  String film;

  KaartjesAutomaat() {
    film = "DIT IS EEN FILMTITEL";
    prijs = 1000.0;
  }

  KaartjesAutomaat(String film, float prijs) {
    this.film = film;
    this.prijs = prijs;
  }

  float bepaalWisselgeld() {
    if (ingeworpenGeld > prijs) {
      return ingeworpenGeld - prijs;
    } else return 0;
  }


  void leegAutomaat() {
    ingeworpenGeld = 0;
  }

  String drukKaartjeAf() {
    if (ingeworpenGeld > prijs) {
      return "Hier is uw kaartje voor de film " + film + " van €" + prijs + "\nUw wisselgeld is: €" +  bepaalWisselgeld();
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