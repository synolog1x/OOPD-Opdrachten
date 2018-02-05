void setup() {
  size(500, 500);
  int getal = 3;
  int[] lijst = {2, 7, 9, 4};

  println(komtGetalVoorIn(getal, lijst));
}

boolean komtGetalVoorIn(int getal, int[] lijst) {
  boolean aanwezig = false;
  for (int i = 0; i<lijst.length; i++) {
    if (getal == lijst[i]) {
      aanwezig = true;
    }
  }
  return aanwezig;
}


/* ONDERDEEL C 
 Een test is goed als meerdere mogelijkheden zijn getest en de verwachte uitkomst te zien is.ø
*/