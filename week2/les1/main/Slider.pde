class Slider {
  float x, y, breedte, hoogte;
  int aantalPosities, huidigePositie;

  Slider(float x, float y, float breedte, float hoogte, int aantalPosities) {
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    this.hoogte = hoogte;
    this.aantalPosities = aantalPosities;
    huidigePositie = 0;
  }

int bepaalSliderPositie() {
  float blokjeBreedte = breedte / aantalPosities;
  
  if (mouseX < x) {
   return 0;
  }
  else if (mouseX >= breedte + x) {
    return aantalPosities - 1;
  }
  else {
    return floor((mouseX  - x) / blokjeBreedte);
  } 
}


void tekenSlider() {
  
  float blokjeBreedte = breedte / aantalPosities;
  
  noStroke();
  fill(255);
  rect(x, y, breedte, hoogte);
  
  fill(#2257F0);
  rect(x + huidigePositie * blokjeBreedte, y, blokjeBreedte, hoogte);  
}


}