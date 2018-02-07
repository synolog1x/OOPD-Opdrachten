class Damsteen {
  int x, y, diameter;
  color kleur;

  Damsteen(int x, int y, int diameter, color kleur) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
  }
}

void setup() {
  size(500,500);
  Damsteen steen1 = new Damsteen(100, 100, 30, #ffffff);
  Damsteen steen2 = new Damsteen(300, 300, 30, #000000);
  Damsteen[] stenen = {steen1, steen2};

  tekenDamStenen(stenen);
}



void tekenDamStenen(Damsteen[] stenen) {
  for (int i=0; i<stenen.length; i++) {
    fill(stenen[i].kleur);
    ellipse(stenen[i].x, stenen[i].y, stenen[i].diameter, stenen[i].diameter);
  }
}