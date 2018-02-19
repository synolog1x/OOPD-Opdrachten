class Damsteen {
  int x, y, diameter;
  color kleur;
  boolean isGeselecteerd;

  Damsteen(int x, int y, int diameter, color kleur) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
    isGeselecteerd = false;
  }

  void tekenSteen() {
    if (isGeselecteerd) {
      stroke(#0000FF);
      strokeWeight(3);
    } else {
      noStroke();
    }
    fill(kleur);
    ellipseMode(CORNER);
    ellipse(x, y, diameter, diameter);
  }

  void isGeselecteerd() {
    if (mouseX >= x && mouseX <= x+diameter && mouseY >= y && mouseY <= y+diameter) {
      isGeselecteerd = true;
    } else {
      isGeselecteerd = false;
    }
  }
}



int grootte = 50;


//MOOIER
Damsteen[] stenen = new Damsteen[]{ new Damsteen(100, 50, grootte, #ffffff), 
  new Damsteen(200, 200, grootte, #ffffff), 
  new Damsteen(300, 300, grootte, #000000), 
  new Damsteen(300, 400, grootte, #000000)
};

void setup() {
  size(500, 500);
  smooth(10);
}


void draw() {
  background(200);
  for (int i=0; i<stenen.length; i++) {
    stenen[i].tekenSteen();
  }
}

void mouseClicked() {
  for (int i=0; i<stenen.length; i++) {
    stenen[i].isGeselecteerd();
  }
}