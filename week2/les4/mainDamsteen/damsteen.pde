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

  String toString() {
      return "Voor de damsteen op positie x = " + x + "y = " + y + " is geselecteerd " + isGeselecteerd + "\n";
    }
  }