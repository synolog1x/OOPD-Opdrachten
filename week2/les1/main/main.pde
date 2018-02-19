void setup() {
  size(300, 200);
  background(0);



  println(s1X == s1.x, s1Y == s1.y, s1Breedte == s1.breedte, s1Hoogte == s1.hoogte, s1NPosities == s1.aantalPosities);
}

float s1X, s1Y, s1Breedte, s1Hoogte;
int s1NPosities;
s1Breedte = 200;
s1Hoogte = 50;
s1X = (width - s1Breedte) / 2;
s1Y = 50;
s1NPosities = 5;

Slider s1 = new Slider(s1X, s1Y, s1Breedte, s1Hoogte, s1NPosities);



void draw() {
  int s1HuidigePositie = bepaalSliderPositie(s1X, s1Breedte, s1NPosities);
  s1.tekenSlider();
}