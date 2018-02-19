class Persoon {
  String naam;
  
  Persoon(String naam) {
    this.naam = naam;
  }
}

void setup() {
  String t = "hallo";
  verander(t);
  println(t);
  
  int g = 10;
  verander(g);
  println(g);
  
  Persoon p = new Persoon("han");
  verander(p);
  println(p.naam);
  veranderAnders(p);
  println(p.naam);
}

void verander(String tekst) {
  tekst = "veranderd";
}

void verander(int getal) {
  getal = 0;
}

void verander(Persoon persoon) {
  persoon.naam = "kareltje";
}

void veranderAnders(Persoon persoon) {
  persoon = new Persoon("pietje puk");
}