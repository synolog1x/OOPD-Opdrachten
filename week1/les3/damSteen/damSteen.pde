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
 Damsteen witteSteen1 = new Damsteen(100, 100, 30, #ffffff);
   Damsteen witteSteen2 = new Damsteen(200 , 200, 30, #ffffff);
  Damsteen zwarteSteen1 = new Damsteen(300, 300, 30, #000000);
    Damsteen zwarteSteen2 = new Damsteen(300, 400, 30, #000000);
  
  
  Damsteen[] stenen = {witteSteen1, witteSteen2, zwarteSteen1, zwarteSteen2};
  
void setup() {
  size(500,500);
 smooth(3);

  
}


void draw(){
tekenDamStenen(stenen);
}


void tekenDamStenen(Damsteen[] stenen) {
  for (int i=0; i<stenen.length; i++) {
    fill(stenen[i].kleur);
    ellipse(stenen[i].x, stenen[i].y, stenen[i].diameter, stenen[i].diameter);
  }
}