class Slider {
  float x, y, breedte, hoogte;
  int aantalPosities, huidigePositie;

  Slider() {
    breedte = 200;
    hoogte = 50;
    x = (width - breedte) / 2;
    y = 50;
    aantalPosities = 5;
    huidigePositie = 0;
  }

  Slider(float x, float y, float breedte, float hoogte, int aantalPosities) {
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    this.hoogte = hoogte;
    this.aantalPosities = aantalPosities;
    huidigePositie = 0;
  }



  void bepaalPositie() {
    float blokjeBreedte = breedte / aantalPosities;

    if (mouseX < x) {
      huidigePositie = 0;
    } else if (mouseX >= breedte + x) {
      huidigePositie = aantalPosities - 1;
    } else {
      huidigePositie = floor((mouseX  - x) / blokjeBreedte);
    }
  }


  void teken() {

    float blokjeBreedte = breedte / aantalPosities;

    noStroke();
    fill(255);
    rect(x, y, breedte, hoogte);

    fill(#2257F0);
    rect(x + huidigePositie * blokjeBreedte, y, blokjeBreedte, hoogte);
  }


String toString(){
return "de huidige positie is: " + huidigePositie;
}

}