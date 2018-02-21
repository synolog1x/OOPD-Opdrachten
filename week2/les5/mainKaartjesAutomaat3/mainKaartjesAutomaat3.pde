Bestelling bestelling = new Bestelling();

void setup() {
  bestelling.selecteerKaartje(0);
 bestelling.selecteerKaartje(0);
  bestelling.selecteerKaartje(0);
   bestelling.selecteerKaartje(1);
    bestelling.selecteerKaartje(1);
    bestelling.kaartjesAutomaat.verhoogIngeworpenGeld(1000.0);
    println(bestelling.bestelling);
    println(bestelling.drukKaartjesAf());
  //kaartje.verhoogIngeworpenGeld(1200.0);

}

void draw() {
}